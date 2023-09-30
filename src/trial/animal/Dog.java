package trial.animal;

public class Dog implements IAnimal {

    private String name;

    public Dog(){
        System.out.println("トレーナーにつきました！");
    };

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void bark(){
        System.out.println("Bow!!!");
    }

    public void run (){
        System.out.println("犬が走りました！");
    }
}
