package trial_exception;

class Apple {

    private final int price;
    private final String destination;

    public Apple(final int price, final String destination){
        this.price = price;
        this.destination = destination;
    }

    static Apple applyDiscount(final Apple apple, final double discountRate) throws InvalidDiscountRateException{
        if(discountRate <= 0 || discountRate > 1) throw new InvalidDiscountRateException(discountRate, "割引率は0より大きく、1以下の値に設定してください。");
        final double priceIncDecimal = apple.price * (1 - discountRate);
        final int price = (int)priceIncDecimal;
        Apple discountedApple = new Apple(price, apple.destination);
        return discountedApple;
    }

    public int getPrice(){
        return this.price;
    }
}
