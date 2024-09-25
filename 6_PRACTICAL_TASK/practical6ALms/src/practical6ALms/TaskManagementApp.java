package practical6ALms;

public class TaskManagementApp {
	 public static void main(String[] args) {
	        TaskManagementSystem taskManager = new TaskManagementSystem();
	        taskManager.addTask("Complete assignment");
	        taskManager.addTask("Read a book");
	        taskManager.updateTask(0, "Complete assignment - Java");
	        taskManager.removeTask(1);
	        taskManager.displayTasks();
	    }

}
