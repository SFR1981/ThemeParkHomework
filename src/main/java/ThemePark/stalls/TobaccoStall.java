package ThemePark.stalls;

import ThemePark.ISecurity;
import ThemePark.Stall;
import ThemePark.Visitor;

public class TobaccoStall extends Stall implements ISecurity{

    public TobaccoStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 18) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public double defaultPrice() {
        return 6.60;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return this.defaultPrice();
    }
}
