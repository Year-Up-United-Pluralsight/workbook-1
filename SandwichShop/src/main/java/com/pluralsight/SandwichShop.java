package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Size of sandwich user prompt
        System.out.println("Hello! What size sandwich would you like?\n   (1) Regular - $5.45\n   (2) Large - $8.95");
        int size = scanner.nextInt();
        scanner.nextLine();

        // Loaded sandwich (y/n) user prompt
        System.out.println("Would you like that as a loaded sandwich?");
        String yesNo = scanner.nextLine();

        // Initializes base price of sandwich
        double basePrice = 0;

        // Sets price of sandwich: Regular(1) = $5.45, Large(2) = $8.95
        if (size == 1) {
            basePrice = 5.45;

            // Adds loaded sandwich additional fee (for a regular) if applicable
            if (yesNo.equals("Yes") || yesNo.equals("yes")){
                basePrice += 1.00;
            }

        } else if (size == 2) {
            basePrice = 8.95;

            // Adds loaded sandwich additional fee (for a large) if applicable
            if (yesNo.equals("Yes") || yesNo.equals("yes")){
                basePrice += 1.75;
            }

        }

        // Exits if user input is not '1' nor '2'
        else {
            System.exit(0);
        }

        // Insert error message and loop for input other than "1" or "2"

        // Age user prompt
        System.out.println("Please enter your age to possibly get a discount");
        int age = scanner.nextInt();

        // Initializes discount price
        double discount = 0;

        // Checks age & applies discount (if user's age is applicable)
        // Applies Student discount, if 17 or younger
        if (age < 18) {
            discount = 0.1;
        }
        // Applies Senior Discount, if 65 or older
        else if (age > 64) {
            discount = 0.2;
        }

        // Outputs sandwich price
        // Prints price without discount, if age is not applicable
        if (discount == 0) {
            System.out.printf("That'll be $%.2f!", basePrice);
        }
        // Prints price with discount, if user is applicable
        else {
            double discountedPrice = basePrice - (basePrice * discount);
            System.out.printf("That'll be $%.2f!", discountedPrice);
        }
    }

}
