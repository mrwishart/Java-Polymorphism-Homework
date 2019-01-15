import Interfaces.IReviewed;
import People.Visitor;
import AbstractClasses.*;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> allEntertainment;

    public ThemePark() {
        allEntertainment = new ArrayList<>();
    }

    public int numberOfShows() {
        return allEntertainment.size();
    }

    public void addEntertainment(IReviewed entertainment){
        allEntertainment.add(entertainment);
    }

    private ArrayList<IReviewed> filterByType(Class findClass){
        ArrayList<IReviewed> filteredEntertainment = new ArrayList<>();

        for (IReviewed entertainment: allEntertainment) {
            if (entertainment.getClass().getSuperclass() == findClass){
                filteredEntertainment.add(entertainment);
            }
        }

        return filteredEntertainment;
    }

    public int numberOfStalls() {
        return filterByType(Stall.class).size();
    }

    public int numberOfAttractions() {
        return filterByType(Attraction.class).size();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> allReviewedEntertainment = new ArrayList<>();

        for (IReviewed entertainment: allEntertainment) {
            if (entertainment.getRating() != -1){
                allReviewedEntertainment.add(entertainment);
            }
        }

        return allReviewedEntertainment;
    }

}
