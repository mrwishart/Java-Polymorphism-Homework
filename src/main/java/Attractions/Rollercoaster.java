package Attractions;

import AbstractClasses.Attraction;
import Interfaces.ISecurity;
import Interfaces.ITicketed;
import People.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, ITicketed {

    private int minimumAge, minimumHeight;
    private double defaultPrice;

    public Rollercoaster(String name) {
        super(name);
        minimumAge = 12;
        minimumHeight = 145;
        defaultPrice = 8.40;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() >= minimumAge && visitor.getHeight() >= minimumHeight);
    }

    public double defaultPrice() {
        return defaultPrice;
    }

    public double priceFor(Visitor visitor) {
        double price = defaultPrice;

        if (visitor.getHeight() > 200) {price *= 2;}

        return price;
    }
}
