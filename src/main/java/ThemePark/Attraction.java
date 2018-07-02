package ThemePark;

public abstract class Attraction implements IReviewed{

    String name;
    int rating;

    public Attraction(String name, int rating){
        this.name = name;
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
