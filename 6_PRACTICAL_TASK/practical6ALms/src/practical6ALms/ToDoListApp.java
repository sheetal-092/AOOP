package practical6ALms;

public class ToDoListApp {
	 public static void main(String[] args) {
	        ToDoList toDoList = new ToDoList();
	        toDoList.addTask("Buy groceries");
	        toDoList.addTask("Clean the house");
	        toDoList.updateTask(0, "Buy groceries - milk and eggs");
	        toDoList.removeTask(1);
	        toDoList.displayTasks();
	    }
}
