package practical7Aweek8Inlab1;

public class StackApp {
	public static void main(String[] args) {
        Stack<Integer> arrayStack = new ArrayStack<>();
        Stack<String> linkedListStack = new LinkedListStack<>();

        
        System.out.println("Testing Array Stack:");
        arrayStack.push(10);
        arrayStack.push(20);
        System.out.println("Top element: " + arrayStack.peek());
        System.out.println("Pop element: " + arrayStack.pop());
        System.out.println("Is stack empty? " + arrayStack.isEmpty());
        
        
        System.out.println("\nTesting Linked List Stack:");
        linkedListStack.push("First");
        linkedListStack.push("Second");
        System.out.println("Top element: " + linkedListStack.peek());
        System.out.println("Pop element: " + linkedListStack.pop());
        System.out.println("Is stack empty? " + linkedListStack.isEmpty());
    }
}
