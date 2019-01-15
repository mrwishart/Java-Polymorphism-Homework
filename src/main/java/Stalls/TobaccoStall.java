package Stalls;

import AbstractClasses.Stall;
import Interfaces.ISecurity;
import People.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    private int minimumAge;

    public TobaccoStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot, 6.60);
        minimumAge = 18;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= minimumAge;
    }
}
