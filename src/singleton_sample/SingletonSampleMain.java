package singleton_sample;

public class SingletonSampleMain {
    // Dog

    public static void SingletonSampleMain(){
        // ふつうにインスタンス生成
        Dog pochi = new Dog();
        pochi.setAge(1);
        Dog taro = new Dog();
        taro.setAge(2);
        System.out.println(pochi.getAge());  // => 1
        System.out.println(taro.getAge());  // => 2

        // シングルトンパターン
        DogSingleton hanako = DogSingleton.INSTANCE;
        hanako.setAge(10);
        System.out.println(hanako.getAge());    // => 10
        DogSingleton chie = DogSingleton.INSTANCE;
        System.out.println(chie.getAge());    // => 10
    }
}
