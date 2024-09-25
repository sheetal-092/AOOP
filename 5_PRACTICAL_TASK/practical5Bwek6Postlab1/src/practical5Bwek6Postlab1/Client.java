package practical5Bwek6Postlab1;

public class Client {
	public static void main(String[] args) {
        Employee employee1 = new Employee("Alice", "Manager");
        Employee employee2 = new Employee("Bob", "Developer");

        SalaryCalculator calculator = new SalaryCalculator();
        System.out.println(employee1.getName() + "'s Salary: " + calculator.calculateSalary(employee1));
        System.out.println(employee2.getName() + "'s Salary: " + calculator.calculateSalary(employee2));
    }
}
