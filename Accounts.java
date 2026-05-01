
abstract class Accounts {
    double balance;
    int accountNumber;
    String accountHoldersName;
    String address;


    Accounts(int accNo, String name, String addr, double bal) {
        accountNumber = accNo;
        accountHoldersName = name;
        address = addr;
        balance = bal;
    }


    abstract void withdrawl(double amount);
    abstract void deposit(double amount);


    void display() {
        System.out.println("Account No" + accountNumber);
        System.out.println("Name" + accountHoldersName);
        System.out.println("Balance" + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;


    SavingsAccount(int accNo, String name, String addr, double bal, double roi) {
        super(accNo, name, addr, bal);
        rateOfInterest = roi;
    }


    void withdrawl(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

   
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

   
    void calculateAmount() {
        double interest = (balance * rateOfInterest) / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}


public class Main {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(102, "Aditi", "Kolkata", 10000, 5);

        acc.display();
        acc.deposit(2000);
        acc.withdrawl(1500);
        acc.calculateAmount();
        acc.display();
    }
}
