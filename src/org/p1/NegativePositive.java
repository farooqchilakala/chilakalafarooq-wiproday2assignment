package org.p1;

import java.util.Scanner;

public class NegativePositive{

    // Function to check if a string is positive
    public static boolean isPositiveString(String str) {
        int n = str.length();
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) < str.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string  ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            if (isPositiveString(input)) {
                System.out.println("The string \"" + input + "\" is a positive string.");
            } else {
            	System.out.println("====");
                System.out.println("The string \"" + input + "\" is not a positive string.");
            }
        }

        scanner.close();
    }
}
