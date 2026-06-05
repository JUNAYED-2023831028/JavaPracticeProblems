package PracticeProblem3;
import java.util.Scanner;

public class Medel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = sc.nextDouble();
        boolean isCompleted = sc.nextBoolean();

        if (isCompleted) {
            if (grade >= 3.5) {
                System.out.println("Medal Awarded");
            }
            else {
                System.out.println("Not");
            }
        }
    }
}