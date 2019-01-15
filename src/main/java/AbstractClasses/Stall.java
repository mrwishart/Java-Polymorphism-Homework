package AbstractClasses;

import Interfaces.IReviewed;

public abstract class Stall implements IReviewed {

    private String name, ownerName;
    private int parkingSpot, rating, minimumRating, maximumRating;

    public Stall(String name, String ownerName, int parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = -1;
        this.minimumRating = 0;
        this.maximumRating = 10;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setParkingSpot(int parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public void setRating(int rating) {
        if (isRatingValid(rating)) {
            this.rating = rating;
        }
    }

    private boolean isRatingValid(int rating){
        return (rating >= minimumRating && rating <= maximumRating);
    }
}
