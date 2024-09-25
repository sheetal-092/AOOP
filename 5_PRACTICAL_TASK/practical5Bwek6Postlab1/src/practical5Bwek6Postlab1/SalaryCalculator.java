package practical5Bwek6Postlab1;

public class SalaryCalculator {
	public double calculateSalary(Employee employee) {
        switch (employee.getRole()) {
            case "Manager":
                return 5000;
            case "Developer":
                return 4000;
            case "Intern":
                return 2000;
            default:
                return 0;
        }
    }
}
