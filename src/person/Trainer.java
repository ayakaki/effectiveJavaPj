package person;

import animal.Dog;

public class Trainer implements IPerson{

    Dog dog = new Dog();

    public Trainer(String dogName){
        dog.setName(dogName);
    }

    public void walkWithDog(){
        System.out.println("散歩に行きます。");
        dog.run();
    }

    public void makeTrick(){
        orderToDog("吼えろ！");
        dog.bark();
    }

    // 命令
    public void orderToDog(String msg){
        System.out.println(dog.getName() + "！" + msg);
    }
}
