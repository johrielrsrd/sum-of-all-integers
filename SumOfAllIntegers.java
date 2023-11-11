import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAllIntegers {
    public static void main(String[] args) {
        System.out.print("Enter a number (no spaces): ");
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> arrayNum = new ArrayList<>();

        while (scan.hasNextInt()) {

            arrayNum.add(scan.nextInt());

            int sum = 0;

            for (int i = 0; i < arrayNum.size(); i++) {
                sum += arrayNum.get(i);
            }

            System.out.println("The current SUM is : " + sum);
            System.out.println();
            System.out.print("Enter another number: ");
        }

        if (!scan.hasNextInt()) {
            System.out.println("Invalid.");
        }
    }
}