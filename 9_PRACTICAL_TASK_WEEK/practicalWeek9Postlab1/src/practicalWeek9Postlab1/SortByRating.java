package practicalWeek9Postlab1;

import java.util.Comparator;


public class SortByRating implements Comparator<Movie>{
	 @Override
	    public int compare(Movie m1, Movie m2) {
	        return Double.compare(m2.getRating(), m1.getRating());  // Descending order
	    }
}
