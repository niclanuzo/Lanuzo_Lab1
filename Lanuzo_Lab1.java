import java.util.Scanner;

public class Lab{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        // Print the first star on a separate line
        System.out.println("*");

        // Upper part of the pattern
        for (int i = 1; i <= n; i++) {
            System.out.print("*"); // Print leading star

            // Print ascending numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print descending numbers from i-1 to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println("*"); // Print trailing star and move to the next line
        }

        // Lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            System.out.print("*"); // Print leading star

            // Print ascending numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print descending numbers from i-1 to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println("*"); // Print trailing star and move to the next line
        }

        // Print the last star on a separate line
        System.out.println("*");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

