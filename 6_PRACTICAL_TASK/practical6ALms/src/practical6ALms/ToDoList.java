package practical6ALms;

import java.util.ArrayList;

public class ToDoList {
	 private ArrayList<String> tasks;

	    public ToDoList() {
	        tasks = new ArrayList<>();
	    }

	    public void addTask(String task) {
	        tasks.add(task);
	    }

	    public void updateTask(int index, String newDescription) {
	        if (index >= 0 && index < tasks.size()) {
	            tasks.set(index, newDescription);
	        }
	    }

	    public void removeTask(int index) {
	        if (index >= 0 && index < tasks.size()) {
	            tasks.remove(index);
	        }
	    }

	    public void displayTasks() {
	        for (int i = 0; i < tasks.size(); i++) {
	            System.out.println((i + 1) + ". " + tasks.get(i));
	        }
	    }

}
