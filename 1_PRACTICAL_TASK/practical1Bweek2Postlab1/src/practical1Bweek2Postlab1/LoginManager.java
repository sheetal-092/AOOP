package practical1Bweek2Postlab1;

public class LoginManager {
	private static LoginManager instance = null;
    private boolean loggedIn;
    private double balance;

    
    private LoginManager() {
        this.loggedIn = false;
        this.balance = 1000.0; 
    }

    
    public static LoginManager getInstance() {
        if (instance == null) {
            instance = new LoginManager();
        }
        return instance;
    }

    
    public void login() {
        if (!loggedIn) {
            loggedIn = true;
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("User is already logged in.");
        }
    }

    
    public void logout() {
        if (loggedIn) {
            loggedIn = false;
            System.out.println("User logged out successfully.");
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    
    public void viewBalance() {
        if (loggedIn) {
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Please log in to view your balance.");
        }
    }

    
    public void deposit(double amount) {
        if (loggedIn) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            viewBalance();
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }
    public void withdraw(double amount) {
        if (loggedIn) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
                viewBalance();
            } else {
                System.out.println("Insufficient funds. Current balance: $" + balance);
            }
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}
