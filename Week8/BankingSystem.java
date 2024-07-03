package Week8;
//You are building a banking application that has a BankAccount class.
// Implement the BankAccount class with encapsulation principles in mind.
// Include private instance variables for the
// account number, account holder name, and account balance.
// Provide public methods to allow clients to deposit and withdraw funds,
// as well as access the account balance.
// Ensure that the account balance cannot be accessed or modified directly.
// Ensure that user cannot withdraw balance if it can go to negative
public class BankingSystem {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankingSystem(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            accountBalance = accountBalance + amount;
            System.out.println("Deposited amount is" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > accountBalance) {
            System.out.println("Insufficient funds. Withdrawal amount exceeds the account balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: $" + accountBalance);
    }

    public static void main(String[] args) {
        BankingSystem account = new BankingSystem("123456", "hari", 1000.0);
        account.displayAccountInfo();
        account.deposit(500.0);
        account.withdraw(2000.0);
        account.withdraw(300.0);
        account.displayAccountInfo();
    }
}