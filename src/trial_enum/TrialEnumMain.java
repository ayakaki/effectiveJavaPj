package trial_enum;

public class TrialEnumMain {
    public static void TrialEnumMain(){
        System.out.println(Fruit.APPLE);   // => APPLE
        System.out.println(Fruit.valueOf("APPLE"));    // => APPLE
        System.out.println(Fruit.ORANGE.getMadeIn());  // => Ehime
        for(Fruit fruit: Fruit.values()){
            System.out.printf(fruit.toString() + ":" + fruit.getPrice() + " ");
        }   // => BANANA:200 ORANGE:100 APPLE:500 
    }
}
