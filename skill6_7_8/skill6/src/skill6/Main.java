package skill6;

public class Main {
	public static void main(String[] args) {
       
        EmployeeManager manager = new EmployeeManager();

      
        manager.addEmployee(new Employee(102, "Alice", 60000));
        manager.addEmployee(new Employee(101, "Bob", 55000));
        manager.addEmployee(new Employee(103, "Charlie", 65000));
        manager.addEmployee(new Employee(104, "David", 50000));

       
        System.out.println("Employees sorted by ID:");
        manager.sortById();
        manager.displayEmployees();

     
        System.out.println("\nEmployees sorted by Name:");
        manager.sortByName();
        manager.displayEmployees();

       
        System.out.println("\nEmployees sorted by Salary:");
        manager.sortBySalary();
        manager.displayEmployees();

      
        Employee original = new Employee(105, "Eve", 70000);
        Employee cloned = original.clone();
        System.out.println("\nOriginal Employee: " + original);
        System.out.println("Cloned Employee: " + cloned);

        
        System.out.println("\nIterating over Employees:");
        for (Employee employee : manager) {
            System.out.println(employee);
        }
    }
}
