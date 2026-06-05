package PracticeProblem2;

public class EvenSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 20; i += 2) {
            sum = sum + i;
        }
        System.out.println("Sum using for loop: " + sum);

        sum = 0;
        int j = 2;
        while (j <= 20) {
            sum = sum + j;
            j += 2;
        }
        System.out.println("Sum using while loop: " + sum);

        sum = 0;
        int k = 2;
        do {
            sum = sum + k;
            k += 2;
        } while (k <= 20);

        System.out.println("Sum using do-while loop: " + sum);
    }
}