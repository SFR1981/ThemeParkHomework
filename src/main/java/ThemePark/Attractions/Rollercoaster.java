package ThemePark.Attractions;

import ThemePark.Attraction;
import ThemePark.ISecurity;
import ThemePark.ITicketed;
import ThemePark.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, ITicketed{
    public Rollercoaster(String name) {
        super(name);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() >= 145 && visitor.getAge() >= 12) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200) {
            return 16.80;
        }else{
            return 8.40;
        }
    }
}
