package ThemePark;

import ThemePark.stalls.TobaccoStall;

import java.util.ArrayList;

public class ThemePark {
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    String name;

    public ThemePark(String name){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.name = name;

    }


    public void addAttraction(Attraction attraction){
        attractions.add(attraction);
    }

    public void addStall(Stall stall){
        stalls.add(stall);
    }

    public int getAttractions(){
        return this.attractions.size();
    }

    public int getStalls(){
        return this.stalls.size();
    }



    public String visit(Visitor visitor, Attraction attraction){
        return attraction.getName() + "has been visited";



    }

    public ArrayList<IReviewed> getiRevieweds() {
        ArrayList<IReviewed> reviews = new ArrayList<>();
        reviews.addAll(attractions);
        reviews.addAll(stalls);
        return reviews;
    }




    public ArrayList<ITicketed> getAllAllowedFor(Visitor visitor){
        ArrayList<ITicketed> allAllowed = new ArrayList<>();
        for (IReviewed reviewable : this.getiRevieweds()){
            if (reviewable instanceof ITicketed){
                if (reviewable instanceof ISecurity){
                    if (((ISecurity) reviewable).isAllowedTo(visitor)){
                        allAllowed.add((ITicketed) reviewable);

                    }
                }else{
                    allAllowed.add((ITicketed) reviewable);
                }
            }
        }
        return allAllowed;
    }

    public String getAllReviews(){
        ArrayList<String> allReviews  = new ArrayList<>();
        for (IReviewed reviewable : this.getiRevieweds()){
            String review = reviewable.getName() + " : " + reviewable.getRating();
            allReviews.add(review);
        }
        return String.join( ", ", allReviews);
    }





}
