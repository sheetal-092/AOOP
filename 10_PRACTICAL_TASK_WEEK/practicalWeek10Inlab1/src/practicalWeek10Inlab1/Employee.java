package practicalWeek10Inlab1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee implements Cloneable {
	private String name;
    private String dob;
    private String mobileNumber;
    private int id;

    public Employee(String name, String dob, String mobileNumber, int id) {
        this.name = name;
        this.dob = dob;
        this.mobileNumber = mobileNumber;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getId() {
        return id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class EmployeeList implements Iterable<Employee> {
    private List<Employee> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }
}

