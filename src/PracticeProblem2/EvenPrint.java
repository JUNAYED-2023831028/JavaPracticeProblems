package PracticeProblem2;

public class EvenPrint {
    public static void main(String[] args) {
        System.out.print("For loop: ");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("While loop: ");
        int j = 2;
        while (j <= 20) {
            System.out.print(j + " ");
            j += 2;
        }
        System.out.println();

        System.out.print("Do-while loop: ");
        int k = 2;
        do {
            System.out.print(k + " ");
            k += 2;
        } while (k <= 20);
    }
}