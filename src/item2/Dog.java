package item2;

public class Dog {
    private final int age;
    private final int size;
    private final int themeNum;
    private final int weight;

    private final String dogName;

    private final String favoriteFood;

    public static class Builder{
        // 必須パラメータ
        private int age;
        private int size;
        private String dogName;
        // オプションパラメータ
        private int themeNum = 100;
        private int weight = 30;
        private String favoriteFood = "ドッグフード";

        public Builder(int age, int size, String dogName){
            this.age = age;
            this.size = size;
            this.dogName = dogName;
        }

        public Builder themeNum(int themeNum){
            this.themeNum = themeNum;
            return this;
        }

        public Builder weight(int weight){
            this.weight = weight;
            return this;
        }

        public Builder favoriteFood(String favoriteFood){
            this.favoriteFood = favoriteFood;
            return this;
        }

        public Dog build(){
            return new Dog(this);
        }

    }

    // インスタンス生成
    private Dog(Builder builder){
        age = builder.age;
        size = builder.size;
        dogName = builder.dogName;
        themeNum = builder.themeNum;
        weight = builder.weight;
        favoriteFood = builder.favoriteFood;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getFavoriteFood(){
        return this.favoriteFood;
    }

}
