package comparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right) {
        return left.getRating() < right.getRating() ? -1 : 1;
    }
}
