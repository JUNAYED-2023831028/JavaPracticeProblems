package PracticeProblem2;

public class OddPrint {
    public static void main(String[] args) {
        System.out.print("For loop: ");
        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("While loop: ");
        int j = 1;
        while (j <= 19) {
            System.out.print(j + " ");
            j += 2;
        }
        System.out.println();

        System.out.print("Do-while loop: ");
        int k = 1;
        do {
            System.out.print(k + " ");
            k += 2;
        } while (k <= 19);
    }
}