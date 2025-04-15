package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String user_name = scanner.nextLine();

        System.out.println("Enter your hours worked: ");
        float hours_worked = scanner.nextFloat();

        System.out.println("Enter your pay rate: ");
        float pay_rate = scanner.nextFloat();

        float gross_pay = pay_rate * hours_worked;

        System.out.printf("Employee Name: %s\nGross Pay: $%.2f", user_name, gross_pay);

    }
}
