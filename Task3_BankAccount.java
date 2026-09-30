class BankAccount {

    String accountHolderName;
    int accountNumber;
    double balance;

    static int totalAccounts = 0;

    // Constructor
    BankAccount(String accountHolderName, int accountNumber, double balance) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

        totalAccounts++;
    }

    void displayAccount() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

public class Task3_BankAccount {

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount("Khushi", 1001, 25000);

        BankAccount account2 =
                new BankAccount("Ananya", 1002, 30000);

        BankAccount account3 =
                new BankAccount("Rahul", 1003, 20000);

        System.out.println("--- Account 1 ---");
        account1.displayAccount();

        System.out.println("--- Account 2 ---");
        account2.displayAccount();

        System.out.println("--- Account 3 ---");
        account3.displayAccount();

        System.out.println("Total Number of Accounts: "
                + BankAccount.totalAccounts);
    }
}