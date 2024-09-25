package practical8ALms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortExample {
	 public static void main(String[] args) {
	        List<String> strings = new ArrayList<>();
	        strings.add("banana");
	        strings.add("apple");
	        strings.add("orange");
	        strings.add("kiwi");

	        Collections.sort(strings, (s1, s2) -> s2.compareTo(s1));

	        System.out.println("Sorted Strings in Descending Order:");
	        for (String str : strings) {
	            System.out.println(str);
	        }
	    }
}
