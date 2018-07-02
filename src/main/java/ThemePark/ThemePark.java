package ThemePark;

import java.util.ArrayList;

public class ThemePark {
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    ArrayList<IReviewed> iRevieweds;
    String name;

    public ThemePark(String name){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.iRevieweds = new ArrayList<>();
        this.name = name;
    }




    public void visit(Visitor visitor, Attraction attraction){



    }

    public ArrayList<IReviewed> getiRevieweds() {
        return iRevieweds;
    }
}
