package vscode;
import java.util.Scanner;

public class Counts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String choice = "yes";
        int pos = 0;
        int neg = 0;
        int zero = 0;

        do {
            System.out.print("Enter a number: ");
            int n = s.nextInt();

            if (n > 0) {
                pos++;
            } else if (n < 0) {
                neg++;
            } else {
                zero++;
            }

            s.nextLine();  // clear leftover newline

            System.out.print("Do you want to enter another number? (yes/no): ");
            choice = s.nextLine();  // take choice input

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("\nTotal positive numbers: " + pos);
        System.out.println("Total negative numbers: " + neg);
        System.out.println("Total zeros: " + zero);

        s.close();
    }
}

