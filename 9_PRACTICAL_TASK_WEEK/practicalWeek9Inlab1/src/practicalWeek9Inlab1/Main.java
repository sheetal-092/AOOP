package practicalWeek9Inlab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	 public static void main(String[] args) {
	      
	        List<Movie> movies = new ArrayList<>();
	        movies.add(new Movie("Inception", 8.8, 2010));
	        movies.add(new Movie("The Matrix", 8.7, 1999));
	        movies.add(new Movie("Interstellar", 8.6, 2014));
	        movies.add(new Movie("The Godfather", 9.2, 1972));
	        movies.add(new Movie("Parasite", 8.6, 2019));

	        
	        Collections.sort(movies);

	       
	        System.out.println("Movies sorted by year of release:");
	        for (Movie movie : movies) {
	            System.out.println(movie);
	        }
	    }
}
