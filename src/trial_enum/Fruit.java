package trial_enum;

public enum Fruit {
    BANANA("Okinawa", 200),
    ORANGE("Ehime", 100),
    APPLE("Aomori", 500);


    private String madeIn;
    private int price;

    private Fruit(String madeIn, int price){
        this.madeIn = madeIn;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public String getMadeIn(){
        return madeIn;
    }
}
