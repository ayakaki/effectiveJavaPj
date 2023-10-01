package item3;

public class Dog {
    public static final Dog INSTANCE = new Dog();

    // シリアライズ対応のため transient を付与
    private transient final int age = 10;
    private Dog(){}

    public int getAge(){
        return this.age;
    }

    // シリアライズ対応
    private Object readResolve(){
        return INSTANCE;
    }
}
