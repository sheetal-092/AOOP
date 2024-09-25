package practical7Aweek8Inlab1;

public class LinkedListNode<T> {
	 T data;
	    LinkedListNode<T> next;

	    LinkedListNode(T data) {
	        this.data = data;
	    }
	}

	class LinkedListStack<T> implements Stack<T> {
	    private LinkedListNode<T> top;

	    @Override
	    public void push(T item) {
	        LinkedListNode<T> newNode = new LinkedListNode<>(item);
	        newNode.next = top;
	        top = newNode;
	    }

	    @Override
	    public T pop() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        T data = top.data;
	        top = top.next;
	        return data;
	    }

	    @Override
	    public T peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        return top.data;
	    }

	    @Override
	    public boolean isEmpty() {
	        return top == null;
	    }
}
