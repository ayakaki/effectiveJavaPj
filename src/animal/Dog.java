package animal;

public class Dog implements IAnimal {

    private String name;

    public Dog(){
        System.out.println("コンストラクタ処理");
    };

    public Dog(String name){
        this.name = name;
    }

    public void bark(){
        System.out.println("Bow!!!");
    }

    public void selfIntro(){
        System.out.println("犬の名前は、" + name + "です。");
    }

    public void run (){
        System.out.println("犬が走りました！");
    }
}
