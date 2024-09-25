package practical9A;

public class NumberPrinter {
	private final Object lock = new Object();
    private int current = 1;
    private final int limit = 15;

    public void printTwo() {
        synchronized (lock) {
            while (current <= limit) {
                if (current % 2 == 0 && current % 3 != 0 && current % 4 != 0 && current % 5 != 0) {
                    System.out.println("Divisible by 2: " + current);
                    current++;
                    lock.notifyAll();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public void printThree() {
        synchronized (lock) {
            while (current <= limit) {
                if (current % 3 == 0 && current % 2 != 0 && current % 4 != 0 && current % 5 != 0) {
                    System.out.println("Divisible by 3: " + current);
                    current++;
                    lock.notifyAll();
                } else {
                    try { 
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public void printFour() {
        synchronized (lock) {
            while (current <= limit) {
                if (current % 4 == 0 && current % 2 != 0 && current % 3 != 0 && current % 5 != 0) {
                    System.out.println("Divisible by 4: " + current);
                    current++;
                    lock.notifyAll();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public void printFive() {
        synchronized (lock) {
            while (current <= limit) {
                if (current % 5 == 0 && current % 2 != 0 && current % 3 != 0 && current % 4 != 0) {
                    System.out.println("Divisible by 5: " + current);
                    current++;
                    lock.notifyAll();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public void printNumber() {
        synchronized (lock) {
            while (current <= limit) {
                if (current % 2 != 0 && current % 3 != 0 && current % 4 != 0 && current % 5 != 0) {
                    System.out.println("Not divisible by 2, 3, 4, or 5: " + current);
                    current++;
                    lock.notifyAll();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
}

public class NumberPrinterTest {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread threadTwo = new Thread(printer::printTwo);
        Thread threadThree = new Thread(printer::printThree);
        Thread threadFour = new Thread(printer::printFour);
        Thread threadFive = new Thread(printer::printFive);
        Thread threadNumber = new Thread(printer::printNumber);

        threadTwo.start();
        threadThree.start();
        threadFour.start();
        threadFive.start();
        threadNumber.start();
    }

}
