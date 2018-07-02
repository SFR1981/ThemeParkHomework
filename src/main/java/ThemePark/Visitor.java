package ThemePark;

public class Visitor {

    int age;
    int height;
    double money;

    public Visitor(int age, int height, double money){
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge(){
        return this.age;
    }

    public int getHeight(){
        return this.height;
    }

    public double getMoney(){
        return this.money;
    }



}
