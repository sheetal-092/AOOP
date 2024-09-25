package practicalWeek9iInlab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John Doe", "Engineering", 75000));
        employees.add(new Employee(102, "Jane Smith", "Marketing", 60000));
        employees.add(new Employee(103, "Emily Davis", "HR", 58000));
        employees.add(new Employee(104, "Robert Brown", "Engineering", 82000));
        employees.add(new Employee(105, "Lucy Green", "Marketing", 72000));

       
        Collections.sort(employees, new SortBySalary());
        System.out.println("Employees sorted by salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

     
        Collections.sort(employees, new SortByName());
        System.out.println("\nEmployees sorted by name:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    
        Collections.sort(employees, new SortByDepartment());
        System.out.println("\nEmployees sorted by department:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
