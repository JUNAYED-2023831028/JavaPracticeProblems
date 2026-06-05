package PracticeProblem4;

class Wallet5 {
    double balance;

    Wallet5(double balance) {
        this.balance = balance;
    }
}

public class Task5 {
    static void addBonus(Wallet5 w, double amount) {
        w.balance += amount;
    }

    static void swap(Wallet5 w1, Wallet5 w2) {
        Wallet5 temp = w1;
        w1 = w2;
        w2 = temp;
    }

    public static void main(String[] args) {
        Wallet5 w1 = new Wallet5(500);
        Wallet5 w2 = new Wallet5(1000);

        addBonus(w1, 100);
        System.out.println("w1 Balance: " + w1.balance);

        swap(w1, w2);
        System.out.println("After swap call:");
        System.out.println("w1: " + w1.balance);
        System.out.println("w2: " + w2.balance);
    }
}