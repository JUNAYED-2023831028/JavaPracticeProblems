package PracticeProblem1;
import java.util.Scanner;

public class AreaOfAEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of an arm: ");
        double arm = sc.nextDouble();


        double area = (Math.sqrt(3) / 4) * (arm * arm);
        System.out.println("Area of Equilateral Triangle: " + area);
    }
}