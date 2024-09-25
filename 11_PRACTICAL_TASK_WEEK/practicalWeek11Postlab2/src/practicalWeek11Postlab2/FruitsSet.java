package practicalWeek11Postlab2;
import java.util.*;

public class FruitsSet {
	public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");

        List<String> sortedFruits = new ArrayList<>(fruits);
        Collections.sort(sortedFruits);

        System.out.println("Fruits in alphabetical order:");
        for (String fruit : sortedFruits) {
            System.out.println(fruit);
        }
    }
}
