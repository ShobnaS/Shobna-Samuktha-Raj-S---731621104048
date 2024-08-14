
public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
   public void withdraw(double amount) {
       if (balance >= amount) {
            balance -= amount;
        }
       else {
           System.out.println("Insufficient balance");
        }
    }
     public double getBalance() {
       return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
class SavingsAccount extends BankAccount {
   private static final double MIN_BALANCE = 100.00;
   public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
   public void withdraw(double amount) {
      if (getBalance() - amount >= MIN_BALANCE) {
           super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of " + MIN_BALANCE + " must be maintained.");
        }
    }
    public static void main(String[] args) {
     
        SavingsAccount myAccount = new SavingsAccount("123456789", 500.00);
        myAccount.deposit(200.00);
        System.out.println("Balance after deposit: " + myAccount.getBalance());
        myAccount.withdraw(550.00); 
        System.out.println("Balance after withdrawal: " + myAccount.getBalance());
        myAccount.withdraw(150.00);
        System.out.println("Balance after withdrawal: " + myAccount.getBalance());
    }
}
