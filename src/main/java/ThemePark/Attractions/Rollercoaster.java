package ThemePark.Attractions;

import ThemePark.Attraction;
import ThemePark.ISecurity;
import ThemePark.Visitor;

public class Rollercoaster extends Attraction implements ISecurity{
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
}
