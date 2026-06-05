package PracticeProblem4;

public class Task1 {
    static double deposit(double balance, double amount) {
        return balance + amount;
    }

    static double withdraw(double balance, double amount) {
        return balance - amount;
    }

    public static void main(String[] args) {
        double balance_1 = 500;
        double balance_2 = 1000;

        balance_1 = deposit(balance_1, 200);
        balance_2 = withdraw(balance_2, 400);

        System.out.println(balance_1);
        System.out.println(balance_2);
    }
}