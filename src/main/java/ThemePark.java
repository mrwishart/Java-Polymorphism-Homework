import Interfaces.IReviewed;
import People.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> allReviewed;

    public ThemePark() {
        allReviewed = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return allReviewed;
    }

}
