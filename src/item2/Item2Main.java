package item2;

public class Item2Main {
    public static void Item2Main(){

        Dog dog = new Dog.Builder(12, 100, "John").weight(20).themeNum(2).favoriteFood("さつまいも").build();

        System.out.println(dog.getWeight()); // => 20
        System.out.println(dog.getFavoriteFood()); // => さつまいも
    }
}
