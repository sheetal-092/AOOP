package skill6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager implements Iterable<Employee>  {
	private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void sortById() {
        Collections.sort(employees); 
    }

    public void sortByName() {
        employees.sort(EmployeeComparators.compareByName); 
    }

    public void sortBySalary() {
        employees.sort(EmployeeComparators.compareBySalary);
    }

    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
