package practical10B;

import java.util.LinkedList;
import java.util.Queue;


public class BoundedBuffer {
	
	class BoundedBuffer {
	    private final Queue<Integer> buffer = new LinkedList<>();
	    private final int capacity = 10; 

	  
	    public synchronized void produce(int item) throws InterruptedException {
	        
	        while (buffer.size() == capacity) {
	            System.out.println("Buffer is full. Producer waiting...");
	            wait();
	        }
	        buffer.add(item);
	        System.out.println("Produced: " + item);
	        notifyAll();
	    }

	 
	    public synchronized int consume() throws InterruptedException {
	        
	        while (buffer.isEmpty()) {
	            System.out.println("Buffer is empty. Consumer waiting...");
	            wait();
	        }
	        int item = buffer.remove();
	        System.out.println("Consumed: " + item);
	        notifyAll(); 
	        return item;
	    }
	}

	
	class Producer implements Runnable {
	    private final BoundedBuffer buffer;

	    public Producer(BoundedBuffer buffer) {
	        this.buffer = buffer;
	    }

	    @Override
	    public void run() {
	        int item = 0;
	        try {
	            while (true) {
	                buffer.produce(++item); 
	                Thread.sleep(500); 
	            }
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }
	}

	
	class Consumer implements Runnable {
	    private final BoundedBuffer buffer;

	    public Consumer(BoundedBuffer buffer) {
	        this.buffer = buffer;
	    }

	    @Override
	    public void run() {
	        try {
	            while (true) {
	                buffer.consume(); 
	                Thread.sleep(1000);
	            }
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }
	}

	
	public class BoundedBufferApp {
	    public static void main(String[] args) {
	        BoundedBuffer buffer = new BoundedBuffer();

	       
	        Thread producerThread = new Thread(new Producer(buffer));
	        Thread consumerThread = new Thread(new Consumer(buffer));

	        
	        producerThread.start();
	        consumerThread.start();
	    }
}
