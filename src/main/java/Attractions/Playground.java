package Attractions;

import AbstractClasses.Attraction;
import Interfaces.ISecurity;
import People.Visitor;

public class Playground extends Attraction implements ISecurity {

    private int minimumAge;

    public Playground(String name) {
        super(name);
        minimumAge = 15;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= minimumAge;
    }

}
