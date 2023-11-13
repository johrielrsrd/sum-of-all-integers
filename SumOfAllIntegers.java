import java.util.Scanner;

public class SumOfAllIntegers {
    public static void main(String[] args) {
        System.out.print("Enter a number (no spaces): ");
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        while (scan.hasNextInt()) {
            sum += scan.nextInt();
            System.out.println("The current SUM is : " + sum);
            System.out.println();
            System.out.print("Enter another number: ");
        }

        if (!scan.hasNextInt()) {
            System.out.println("Invalid.");
        }
    }
}