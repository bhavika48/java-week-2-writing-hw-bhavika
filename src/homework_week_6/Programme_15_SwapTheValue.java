package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */

public class Programme_15_SwapTheValue {
    public static void main(String[] args) {
        // scanner declaration for reading
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value :");
        int first = scanner.nextInt();
        System.out.println();
        int second = scanner.nextInt();
        Programme_15_SwapTheValue t = new Programme_15_SwapTheValue();
        t.swapatheValue(first, second);
        // closing the scanner object
        scanner.close();
    }

    // swapping the value of variable
    public void swapatheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping, The value of first variable is : " + a + "and second variable is :" + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The value of first variable is :" + a + "and second variable is :" + b);
    }
}
