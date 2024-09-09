package skill6;

import java.util.Comparator;

public class EmployeeComparators {
	public static Comparator<Employee> compareByName = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

   
    public static Comparator<Employee> compareBySalary = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e1.getSalary(), e2.getSalary());
        }
    };
}
