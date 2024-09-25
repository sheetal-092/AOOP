package practical1Bweek2Postlab1;

public class BankingSystem {
	public static void main(String[] args) {
        
        LoginManager loginManager = LoginManager.getInstance();

        
        loginManager.viewBalance();
        loginManager.deposit(200.0);

        
        loginManager.login();

       
        loginManager.viewBalance();
        loginManager.deposit(500.0);
        loginManager.withdraw(300.0);

        
        loginManager.logout();

        
        loginManager.withdraw(100.0);
    }
}
