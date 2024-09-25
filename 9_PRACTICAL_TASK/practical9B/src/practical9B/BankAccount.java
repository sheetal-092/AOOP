package practical9B;

public class BankAccount {
	private double balance;

   
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

   
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", New balance: " + balance);
        }
    }

   
    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", New balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw: " + amount + " (Insufficient funds)");
        }
    }

    public double getBalance() {
        return balance;
    }
}


class BankTransaction implements Runnable {
    private final BankAccount account;

    
    public BankTransaction(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
       
        account.deposit(100);
        account.withdraw(50);
        account.deposit(200);
        account.withdraw(150);
        account.withdraw(200);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        
        BankAccount sharedAccount = new BankAccount(1000);

      
        Thread user1 = new Thread(new BankTransaction(sharedAccount), "User 1");
        Thread user2 = new Thread(new BankTransaction(sharedAccount), "User 2");
        Thread user3 = new Thread(new BankTransaction(sharedAccount), "User 3");

       
        user1.start();
        user2.start();
        user3.start();

       
        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       
        System.out.println("Final balance: " + sharedAccount.getBalance());
    }
}
