// Abstract class
abstract class Accounts {
    double balance;
    int accountNumber;
    String accountHoldersName;
    String address;

    // Constructor
    Accounts(int accNo, String name, String addr, double bal) {
        accountNumber = accNo;
        accountHoldersName = name;
        address = addr;
        balance = bal;
    }

    // Abstract methods
    abstract void withdrawl(double amount);
    abstract void deposit(double amount);

    // Display method
    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + accountHoldersName);
        System.out.println("Balance: " + balance);
    }
}

// Subclass
class SavingsAccount extends Accounts {
    double rateOfInterest;

    // Constructor
    SavingsAccount(int accNo, String name, String addr, double bal, double roi) {
        super(accNo, name, addr, bal);
        rateOfInterest = roi;
    }

    // Implement withdrawl
    void withdrawl(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Implement deposit
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Calculate amount after interest
    void calculateAmount() {
        double interest = (balance * rateOfInterest) / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(101, "Durba", "Kolkata", 10000, 5);

        acc.display();
        acc.deposit(2000);
        acc.withdrawl(1500);
        acc.calculateAmount();
        acc.display();
    }
}