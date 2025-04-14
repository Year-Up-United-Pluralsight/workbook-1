package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the first number: ");
        float first_float = scanner.nextFloat(); // The "" is an empty string added to the float to make it a string

        System.out.println("Enter the second number: ");
        float second_float = scanner.nextFloat(); // The "" is an empty string added to the float to make it a string
        scanner.nextLine();   // Clears the CRLF caused by the nextFloat() -- so that nextLine() works later

        System.out.println("Possible calculations:");
        System.out.println("(A) Add");
        System.out.println("(S) Subtract");
        System.out.println("(M) Multiply");
        System.out.println("(D) Divide");

        System.out.println("Please select an option: ");
        String user_option = scanner.nextLine();

        float sum_floats = first_float * second_float;

        // The "" is an empty string added to the float to make it a string
        String first_float_stringed = first_float + "";
        String second_float_stringed = second_float + "";
        String sum_floats_stringed = sum_floats + "";

        String answer = String.format("%f * %f = %f", first_float, second_float, sum_floats);
        System.out.println(answer);

    }
}
