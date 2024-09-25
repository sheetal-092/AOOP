package practical5Bwek6Postlab1;

public class Client2 {
	public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly(); // Works fine

        Bird ostrich = new Ostrich();
        try {
            ostrich.fly(); // Throws an exception
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
