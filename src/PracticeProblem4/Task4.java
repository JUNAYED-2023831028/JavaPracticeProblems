package PracticeProblem4;

class Wallet4 {
    double balance;
    String lastWithdrawMode = "None";

    Wallet4(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        this.balance -= amount;
        this.lastWithdrawMode = "Normal";
    }

    void withdraw(double amount, String mode) {
        this.balance -= amount;
        this.lastWithdrawMode = mode;
    }

    void display() {
        System.out.println("Balance: " + balance + " --> Mode: " + lastWithdrawMode);
    }
}

public class Task4 {
    public static void main(String[] args) {
        Wallet4 w = new Wallet4(1000);

        w.withdraw(100);
        w.display();

        w.withdraw(200, "ATM");
        w.display();
    }
}