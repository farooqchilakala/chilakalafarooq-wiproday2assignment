package org.p1;
import java.util.Scanner;

public class StringOperation {

    //  add the string to itself
    public static String addStringToItself(String s) {
        return s + s;
    }

    // replace odd positions with #
    public static String replaceOddPositionsWithHash(String s) {
        char[] result = s.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (i % 2 != 0) {
                result[i] = '#';
            }
        }
        return new String(result);
    }

    //  remove duplicate characters
    public static String removeDuplicateCharacters(String s) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256]; 
        for (char c : s.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //  change odd characters to uppercase
    public static String changeOddCharactersToUppercase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add the String to itself");
            System.out.println("2. Replace odd positions with #");
            System.out.println("3. Remove duplicate characters in the String");
            System.out.println("4. Change odd characters to upper case");
            System.out.println("5. Exit");

            System.out.print("Enter the range between 1 to 5: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String originalString1 = scanner.nextLine();
                    System.out.println("Result: " + addStringToItself(originalString1));
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    String originalString2 = scanner.nextLine();
                    System.out.println("Result: " + replaceOddPositionsWithHash(originalString2));
                    break;
                case 3:
                    System.out.print("Enter a string: ");
                    String originalString3 = scanner.nextLine();
                    System.out.println("Result: " + removeDuplicateCharacters(originalString3));
                    break;
                case 4:
                    System.out.print("Enter a string: ");
                    String originalString4 = scanner.nextLine();
                    System.out.println("Result: " + changeOddCharactersToUppercase(originalString4));
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a number from 1 to 5.");
            }
        }
    }
}
