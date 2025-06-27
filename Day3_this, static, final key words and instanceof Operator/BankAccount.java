public class BankAccount {
    static String bankName = "State Bank";
    static int totalAccounts = 0;
    final String accountNumber;
    String accountHolderName;
    BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("----------------------------");
        }
    }
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Arun", "ACC1001");
        b1.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
