package practicalWeek7Postlab2;

import java.util.Arrays;

public class Main {
	 public static void main(String[] args) {
	       
	        Integer[] intArray = {64, 34, 25, 12, 22, 11, 90};
	        BubbleSort.bubbleSort(intArray);
	        System.out.println("Sorted Integer array: " + Arrays.toString(intArray));

	       
	        Double[] doubleArray = {64.5, 34.1, 25.2, 12.4, 22.9, 11.3, 90.0};
	        BubbleSort.bubbleSort(doubleArray);
	        System.out.println("Sorted Double array: " + Arrays.toString(doubleArray));

	       
	        String[] stringArray = {"banana", "apple", "grape", "cherry", "fig", "date"};
	        BubbleSort.bubbleSort(stringArray);
	        System.out.println("Sorted String array: " + Arrays.toString(stringArray));
	    }
	
}
