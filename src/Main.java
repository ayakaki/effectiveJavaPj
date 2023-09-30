import animal.Dog;
import common.Const;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Ponta");
        dog.bark();
        dog.selfIntro();
        dog.run();
        System.out.println(Const.TRIAL_STR);
    }
}