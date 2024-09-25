package practical10A;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
	private final Queue<String> buffer = new LinkedList<>();
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    
    public synchronized void produce(String message) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); 
        }
        buffer.add(message);
        System.out.println("Produced: " + message);
        notify(); 
    }


    public synchronized String consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); 
        }
        String message = buffer.remove();
        notify(); 
        System.out.println("Consumed: " + message);
        return message;
    }
}


class Producer implements Runnable {
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int messageCount = 1;
        try {
            while (true) {
                String message = "Message " + messageCount;
                buffer.produce(message);
                messageCount++;
                Thread.sleep(500); // Simulate time taken to produce a message
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


class Consumer implements Runnable {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
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


public class MessagingApp {
    public static void main(String[] args) {
       
        SharedBuffer buffer = new SharedBuffer(5);

        
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

       
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
