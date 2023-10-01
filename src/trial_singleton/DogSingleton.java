package trial_singleton;

public class DogSingleton {
    public static DogSingleton INSTANCE = new DogSingleton();
    private int age = 20;

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
