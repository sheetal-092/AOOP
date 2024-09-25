package practical6Bweek7Inlab1;

public class GenericMinMaxApp {
	 public static void main(String[] args) {
	        Integer[] intArray = {3, 5, 1, 8, 2};
	        String[] stringArray = {"apple", "orange", "banana", "grape"};
	        Character[] charArray = {'b', 'a', 'd', 'c'};
	        Float[] floatArray = {3.5f, 1.2f, 4.7f, 2.8f};

	        MinMax<Integer> intMinMax = new MinMaxImpl<>();
	        MinMax<String> stringMinMax = new MinMaxImpl<>();
	        MinMax<Character> charMinMax = new MinMaxImpl<>();
	        MinMax<Float> floatMinMax = new MinMaxImpl<>();

	        System.out.println("Integer Array - Min: " + intMinMax.min(intArray) + ", Max: " + intMinMax.max(intArray));
	        System.out.println("String Array - Min: " + stringMinMax.min(stringArray) + ", Max: " + stringMinMax.max(stringArray));
	        System.out.println("Character Array - Min: " + charMinMax.min(charArray) + ", Max: " + charMinMax.max(charArray));
	        System.out.println("Float Array - Min: " + floatMinMax.min(floatArray) + ", Max: " + floatMinMax.max(floatArray));
	    }
}
