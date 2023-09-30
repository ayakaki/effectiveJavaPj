package singleton_sample;

public class DogSingleton {
    public static DogSingleton INSTANCE = new DogSingleton();
    private int age;

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
