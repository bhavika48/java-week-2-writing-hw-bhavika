package homework_week_6;/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */

import java.util.Scanner;

public class Programme_13_AverageOfNumbers {
    public static void main(String[] args) {
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        double x = scanner.nextDouble();
        System.out.println("Enter the second number :");
        double y = scanner.nextDouble();
        System.out.println("Enter the third number :");
        double z = scanner.nextDouble();
        averageOfThreeNumber(x, y, z);
        // closing the scanner object
        scanner.close();

    }

    public static void averageOfThreeNumber(double a, double b, double c) {
        double average = (a + b + c);
        System.out.println("The avearge of " + a + "," + "and" + c + "is :" + average);
    }
}

