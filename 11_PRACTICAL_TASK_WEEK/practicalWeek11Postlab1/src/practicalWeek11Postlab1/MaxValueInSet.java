package practicalWeek11Postlab1;

import java.util.HashSet;
import java.util.Set;

public class MaxValueInSet {
	public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(40);
        numbers.add(15);

        int max = findMax(numbers);
        System.out.println("Maximum value in the set: " + max);
    }

    public static int findMax(Set<Integer> set) {
        int max = Integer.MIN_VALUE;
        for (int number : set) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
