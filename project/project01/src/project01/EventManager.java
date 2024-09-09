package project01;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
	private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void generateEvent(String event) {
        System.out.println("Event generated: " + event);
        notifyObservers(event);
    }

}
