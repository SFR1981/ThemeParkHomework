package ThemePark;

import ThemePark.stalls.TobaccoStall;

import java.util.ArrayList;

public class ThemePark {
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    ArrayList<IReviewed> iRevieweds;
    ArrayList<ISecurity> iSecurities;
    String name;

    public ThemePark(String name){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.iRevieweds = new ArrayList<>();
        this.name = name;
        this.iSecurities = new ArrayList<>();
    }




    public void visit(Visitor visitor, Attraction attraction){



    }

    public ArrayList<IReviewed> getiRevieweds() {
        return iRevieweds;
    }

    public void addtolist(ISecurity attraction){
        iSecurities.add(attraction);
    }

    public ArrayList<ISecurity> getAllowed(Visitor visitor){
        ArrayList<ISecurity> allowed = new ArrayList<>();
        for (ISecurity iSecurity: this.iSecurities){
            if (iSecurity.isAllowedTo(visitor)){
                allowed.add(iSecurity);
            }
        }
        return allowed;

    }





}
