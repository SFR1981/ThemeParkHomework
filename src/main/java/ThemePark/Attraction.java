package ThemePark;

public abstract class Attraction implements IReviewed{

    String name;
    int rating;

    public Attraction(String name){
        this.name = name;
        this.rating = 0;
    }


    public String getName() {
        return name;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
