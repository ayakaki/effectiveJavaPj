import animal.Dog;
import common.Const;
import person.Trainer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("いぬ太郎");
        trainer.walkWithDog();
        trainer.makeTrick();
        System.out.println(Const.TRIAL_STR);
    }
}