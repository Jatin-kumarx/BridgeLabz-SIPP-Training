public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    public BankAccount(String holder, int accNo, double bal) {
        accountHolder = holder;
        accountNumber = accNo;
        balance = bal;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    void displayBalance() {
        System.out.println("Balance: ₹" + balance);
    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Jatin", 123456, 1000);
        b.deposit(500);
        b.withdraw(200);
        b.displayBalance();
    }
}
