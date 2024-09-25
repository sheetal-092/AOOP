package practical5Bwek6Postlab1;

public class Client3 {
	public static void main(String[] args) {
        Worker robot = new Robot();
        robot.work();

        Human human = new Human();
        human.work();
        human.eat();
    }
}
