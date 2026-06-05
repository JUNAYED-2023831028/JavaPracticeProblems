package PracticeProblem4;

class Wallet {
    private double balance;

    void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    double getBalance() {
        return this.balance;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet();

        myWallet.deposit(500);
        myWallet.withdraw(200);
        System.out.println(myWallet.getBalance());
    }
}