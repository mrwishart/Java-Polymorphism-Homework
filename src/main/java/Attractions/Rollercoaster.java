package Attractions;

import AbstractClasses.Attraction;
import Interfaces.ISecurity;
import People.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    private int minimumAge, minimumHeight;

    public Rollercoaster(String name) {
        super(name);
        minimumAge = 12;
        minimumHeight = 145;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() >= minimumAge && visitor.getHeight() >= minimumHeight);
    }
}
