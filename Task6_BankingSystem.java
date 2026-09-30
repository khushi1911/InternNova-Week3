// Encapsulation
class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Setters
    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    // Getters
    int getAccountNumber() {
        return accountNumber;
    }

    String getAccountHolderName() {
        return accountHolderName;
    }

    double getBalance() {
        return balance;
    }
}


// Abstraction
abstract class Account {

    // Abstract method
    @SuppressWarnings("unused")
    abstract void accountType();

    // Normal method
    void displayMessage() {
        System.out.println("This is a banking account.");
    }
}


// Child class
class SavingsAccount extends Account {

    @Override
    void accountType() {
        System.out.println("Account Type: Savings Account");
    }
}


public class Task6_BankingSystem {

    public static void main(String[] args) {

        // Encapsulation
        BankAccount account = new BankAccount();

        account.setAccountNumber(1001);
        account.setAccountHolderName("Khushi");
        account.setBalance(25000);

        System.out.println("--- Bank Account Details ---");
        System.out.println("Account Number: "
                + account.getAccountNumber());
        System.out.println("Account Holder: "
                + account.getAccountHolderName());
        System.out.println("Balance: "
                + account.getBalance());

        // Abstraction
        System.out.println("\n--- Abstraction ---");

        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.displayMessage();
        savingsAccount.accountType();
    }
}