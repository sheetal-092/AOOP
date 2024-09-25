package practicalWeek7Postlab1;

public class Main {
	public static void main(String[] args) {
      
        Integer[] intArray = {3, 6, 8, 12, 14, 17, 25, 30, 36, 40};
        BinarySearch<Integer> intSearch = new BinarySearch<>();
        intSearch.sortArray(intArray); // Ensure array is sorted
        int intResult = intSearch.binarySearch(intArray, 17);
        System.out.println("Integer 17 found at index: " + intResult);

       
        Double[] doubleArray = {3.1, 6.5, 8.9, 12.2, 14.7, 17.3, 25.8};
        BinarySearch<Double> doubleSearch = new BinarySearch<>();
        doubleSearch.sortArray(doubleArray); // Ensure array is sorted
        int doubleResult = doubleSearch.binarySearch(doubleArray, 14.7);
        System.out.println("Double 14.7 found at index: " + doubleResult);

       
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig", "grape"};
        BinarySearch<String> stringSearch = new BinarySearch<>();
        stringSearch.sortArray(stringArray); 
        int stringResult = stringSearch.binarySearch(stringArray, "date");
        System.out.println("String 'date' found at index: " + stringResult);
    }
}
