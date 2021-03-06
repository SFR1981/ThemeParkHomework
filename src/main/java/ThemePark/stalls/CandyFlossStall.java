package ThemePark.stalls;

import ThemePark.Stall;
import ThemePark.Visitor;

public class CandyFlossStall extends Stall {

    public CandyFlossStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.20;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return this.defaultPrice();
    }
}
