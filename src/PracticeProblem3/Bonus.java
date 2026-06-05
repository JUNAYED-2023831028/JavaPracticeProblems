package PracticeProblem3;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sales = sc.nextInt();
        int attendance = sc.nextInt();

        if (sales >= 95 && attendance == 100) {
            System.out.println("60% Bonus");
        }
        else if (sales >= 95 && attendance >= 90) {
            System.out.println("40% Bonus");
        }
        else if (sales >= 80 && attendance == 100) {
            System.out.println("40% Bonus");
        }
        else if (sales >= 80 && attendance >= 90) {
            System.out.println("20% Bonus");
        }
        else {
            System.out.println("5% Bonus");
        }
    }
}