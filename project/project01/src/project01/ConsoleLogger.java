package project01;

public class ConsoleLogger implements Observer {
	@Override
    public void update(String event) {
        System.out.println("ConsoleLogger - Event Logged: " + event);
    }

}
