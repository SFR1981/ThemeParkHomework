package ThemePark.Attractions;

import ThemePark.Attraction;
import ThemePark.ITicketed;
import ThemePark.Visitor;

public class Dodgems extends Attraction implements ITicketed{
    public Dodgems(String name) {
        super(name);
    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return 2.25;
        } else {
            return 4.50;
        }
    }
}
