package Attractions;
import AbstractClasses.Attraction;
import Interfaces.ITicketed;
import People.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double standardPrice;

    public Dodgems(String name) {
        super(name);
        standardPrice = 4.50;
    }

    public double defaultPrice() {
        return standardPrice;
    }

    public double priceFor(Visitor visitor) {
        double price = standardPrice;

        if (visitor.getAge() < 12) {price *= 0.5;}

        return price;
    }
}
