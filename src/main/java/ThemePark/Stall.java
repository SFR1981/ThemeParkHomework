package ThemePark;

public abstract class Stall implements IReviewed, ITicketed{


    String name;
    String ownerName;
    String parkingSpot;
    int rating;

    public Stall(String name, String ownerName, String parkingSpot, int rating){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName(){
        return name;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public String getParkingSpot(){
        return parkingSpot;
    }

    public int getRating(){
        return this.rating;
    }


}
