package practicalWeek9Postlab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("The Prestige", 8.5, 2006));

        System.out.println("Movies before sorting:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        Collections.sort(movies, new SortByRating());

        System.out.println("\nMovies sorted by rating:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
