package practical7Bweek8Postlab1;

import java.util.Comparator;

public class PriorityQueueApp {
	 public static void main(String[] args) {
	        PriorityQueue<Integer> intQueue = new PriorityQueue<>(Comparator.reverseOrder());
	        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(Comparator.naturalOrder());
	        PriorityQueue<String> stringQueue = new PriorityQueue<>(Comparator.naturalOrder());

	        intQueue.add(10);
	        intQueue.add(30);
	        intQueue.add(20);

	        doubleQueue.add(3.14);
	        doubleQueue.add(1.59);
	        doubleQueue.add(2.71);

	        stringQueue.add("banana");
	        stringQueue.add("apple");
	        stringQueue.add("orange");

	        System.out.println("Integer Priority Queue:");
	        while (!intQueue.isEmpty()) {
	            System.out.println(intQueue.remove());
	        }

	        System.out.println("\nDouble Priority Queue:");
	        while (!doubleQueue.isEmpty()) {
	            System.out.println(doubleQueue.remove());
	        }

	        System.out.println("\nString Priority Queue:");
	        while (!stringQueue.isEmpty()) {
	            System.out.println(stringQueue.remove());
	        }
	    }
}
