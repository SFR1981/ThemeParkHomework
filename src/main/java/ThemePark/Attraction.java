package ThemePark;

public abstract class Attraction {

    String name;

    public Attraction(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
