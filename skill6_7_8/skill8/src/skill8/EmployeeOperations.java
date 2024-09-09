package skill8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeOperations {
	public static void main(String[] args) {
       
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 70000),
            new Employee(2, "Bob", 60000),
            new Employee(3, "Charlie", 75000),
            new Employee(4, "David", 50000),
            new Employee(5, "Eve", 65000),
            new Employee(6, "Frank", 48000),
            new Employee(7, "Grace", 72000),
            new Employee(8, "Hank", 82000),
            new Employee(9, "Ivy", 90000),
            new Employee(10, "Jack", 54000)
        );

       
        System.out.println("Employees with salary greater than 60,000:");
        List<Employee> filteredEmployees = employees.stream()
            .filter(emp -> emp.getSalary() > 60000)
            .collect(Collectors.toList());
        filteredEmployees.forEach(System.out::println);

       
        System.out.println("\nEmployees sorted by name:");
        List<Employee> sortedByName = employees.stream()
            .sorted(Comparator.comparing(Employee::getName))
            .collect(Collectors.toList());
        sortedByName.forEach(System.out::println);

        Optional<Employee> highestSalaryEmployee = employees.stream()
            .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("\nEmployee with the highest salary:");
        highestSalaryEmployee.ifPresent(System.out::println);

      
        DoubleSummaryStatistics salaryStats = employees.stream()
            .mapToDouble(Employee::getSalary)
            .summaryStatistics();
        System.out.println("\nAverage salary of employees: " + salaryStats.getAverage());
    }
}
