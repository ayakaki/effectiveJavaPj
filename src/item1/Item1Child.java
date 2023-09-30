package item1;

public class Item1Child {

    private String childName ="";
    private Item1Child(String childName){
        this.childName = childName;
    }

    public static String getName(){
        Item1Child child = new Item1Child("太郎");
        return child.childName;
    }
}
