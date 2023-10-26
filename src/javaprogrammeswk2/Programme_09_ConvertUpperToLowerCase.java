package javaprogrammeswk2;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_09_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_09_ConvertUpperToLowerCase t = new Programme_09_ConvertUpperToLowerCase();
        t.convertUppercaseToLowerCase(uppercase);
        // closing the scanner object
        scanner.close();
    }

    // Conversion of Uppercase to Lower case method
    public void convertUppercaseToLowerCase(String text) {
        System.out.println("The lowercase value is : " + text.toLowerCase());
    }
}
