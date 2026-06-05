package PracticeProblem2;

public class OddSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 19; i += 2) {
            sum = sum + i;
        }
        System.out.println("Sum using for loop: " + sum);

        sum = 0;
        int j = 1;
        while (j <= 19) {
            sum = sum + j;
            j += 2;
        }
        System.out.println("Sum using while loop: " + sum);

        sum = 0;
        int k = 1;
        do {
            sum = sum + k;
            k += 2;
        } while (k <= 19);

        System.out.println("Sum using do-while loop: " + sum);
    }
}