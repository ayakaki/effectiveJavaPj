package trial_exception;

public class TrialExceptionMain {
    public static void TrialExceptionMain(){
        try{
            Apple apple = new Apple(200, "Tokyo");
            Apple discountedApple = Apple.applyDiscount(apple, 0.2);
            System.out.println(apple.getPrice());   // => 200
            System.out.println(discountedApple.getPrice()); // => 160
            Apple failDiscountApple = Apple.applyDiscount(apple, -0.5); // => 割引率は0より大きく、1以下の値に設定してください。 入力値：-0.5
        }catch(InvalidDiscountRateException e){
            System.out.println(e.getMessage() + " 入力値：" + e.getDiscountRate() );
        }
    }
}
