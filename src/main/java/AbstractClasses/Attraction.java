package AbstractClasses;

import Interfaces.IReviewed;

public abstract class Attraction implements IReviewed {

    private String name;
    private int rating, minimumRating, maximumRating;

    public Attraction(String name) {
        this.name = name;
        this.rating = -1;
        this.minimumRating = 0;
        this.maximumRating = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
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
