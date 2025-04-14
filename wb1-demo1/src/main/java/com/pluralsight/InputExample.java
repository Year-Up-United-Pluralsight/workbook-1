package com.pluralsight;
import java.util.Scanner;

public class InputExample {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("What is your name?");
        String name;
        name = scanner.nextLine();

        System.out.println("Hi " + name + ", Let's do some math!");


        System.out.println("What is the first number?");
        double number1 = scanner.nextDouble();

        System.out.println("What is the second number?");
        double number2 = scanner.nextDouble();

        double product = number1 * number2;

        // We use %f and not %d because, %d refers to Decimal, not Double -- so Float is more applicable
        System.out.printf("The product of %f and %f is %f", number1, number2, product);

        System.out.println("The product of " + number1 + " and " + number2 + " is " + product);
        System.out.println("The product of " + number1 + " and " + number2 + " is " + product);

    }
}
