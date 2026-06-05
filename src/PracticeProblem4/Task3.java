package PracticeProblem4;

class Walet {
    private double balance;
    private final int id;
    private static int counter = 1;

    Walet() {
        this.balance = 0;
        this.id = counter++;
    }

    Walet(double balance) {
        this.balance = balance;
        this.id = counter++;
    }

    void display() {
        System.out.println("Wallet ID: " + this.id + " --> Balance: " + this.balance);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Walet w1 = new Walet();
        Walet w2 = new Walet(1000);

        w1.display();
        w2.display();
    }
}