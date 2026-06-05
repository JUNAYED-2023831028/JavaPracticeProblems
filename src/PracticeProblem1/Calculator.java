package PracticeProblem1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter an operator: ");
        char ch = sc.next().charAt(0);

        if (ch == '+') {
            System.out.println(a + b);
        }
        else if (ch == '-') {
            System.out.println(a - b);
        }
        else if (ch == '*') {
            System.out.println(a * b);
        }
        else if (ch == '/') {
            if (b != 0) {
                System.out.println(a / b);
            }
            else {
                System.out.println("Error");
            }
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}