package practicalWeek10Inlab1;

public class EmployeeManagementSystem {
	 public static void main(String[] args) {
	        EmployeeList employeeList = new EmployeeList();
	        employeeList.addEmployee(new Employee("John Doe", "1990-01-15", "1234567890", 1));
	        employeeList.addEmployee(new Employee("Jane Smith", "1992-03-22", "0987654321", 2));

	        for (Employee employee : employeeList) {
	            System.out.println("Name: " + employee.getName());
	            System.out.println("DOB: " + employee.getDob());
	            System.out.println("Mobile Number: " + employee.getMobileNumber());
	            System.out.println("ID: " + employee.getId());
	            System.out.println();
	        }
	    }
}
