package com.pluralsight;
import java.util.Scanner;

// "STATIC" = GLOBAL WITHIN THE CLASS
public class RentalCarCalculator {

    // Sets scanner for user input
    static Scanner scanner = new Scanner(System.in);

    // STATIC VARIABLE INITIALIZATION -------------------------------------------------
    // User Responses to Personal Info & Additional Options
    static String pickupDate;
    static int days;
    static String elecToll;
    static String gps;
    static String roadAssist;
    static int age;

    // Total Calculations of Options
    static double elecTollTotal;
    static double gpsTotal;
    static double roadAssistTotal;

    // Rates for Additional Options
    static double basicRentalPrice = 29.99;     // Basic car rental price is $29.99 per day
    static double elecTollPrice = 3.95;         // Electronic toll tag price is $3.95 per day
    static double gpsPrice = 2.95;              // GPS price is $2.95 per day
    static double roadAssistPrice = 3.95;       // Roadside assistance price is $3.95 per day

    // --------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        // Gets User's Info
        userPrompts();

        // Calculates Costs & Displays them
        calcAndDisplay();
    }

    // Prompts user for info & stores it into variables
    public static void userPrompts() {
        // Pickup date of car user prompt
        System.out.println("Hello! What date would you like to pick up your car?");
        pickupDate = scanner.nextLine();

        // Day duration of rental user prompt
        System.out.println("How many days would you like to rent the car for?");
        days = scanner.nextInt();
        scanner.nextLine();

        // Electronic toll (y/n) user prompt
        System.out.println("Would you like an electronic toll tag for $3.95 a day?");
        elecToll = scanner.nextLine();

        // GPS (y/n) user prompt
        System.out.println("Would you like a GPS for $2.95 a day?");
        gps = scanner.nextLine();

        // Roadside assistance (y/n) user prompt
        System.out.println("Would you like roadside assistance at $3.95 a day?");
        roadAssist = scanner.nextLine();

        // Pickup date user prompt
        System.out.println("How old are you?");
        age = scanner.nextInt();
        scanner.nextLine();
    }

    // Calculates and displays cost of each option
    public static void calcAndDisplay () {

    // Calculations ----------------------------------------------------------------------

        // Basic car rental calculation
        double basicRentalTotal = basicRentalPrice * days;

        // Electronic toll calculation
        if (elecToll.equals("Yes") || elecToll.equals("yes")){
            elecTollTotal = elecTollPrice * days;
        }

        // GPS calculation
        if (gps.equals("Yes") || gps.equals("yes")) {
            gpsTotal = gpsPrice * days;
        }

        // Roadside assistance calculation
        if (roadAssist.equals("Yes") || roadAssist.equals("yes")) {
            roadAssistTotal = roadAssistPrice * days;
        }


        // Underage driver surcharge
        if (age < 25){
            basicRentalTotal += (basicRentalTotal * 0.3);
        }

        // Total cost
        double totalPrice = basicRentalTotal + elecTollTotal + gpsTotal + roadAssistTotal;



    // Displays -----------------------------------------------------------------------------------

        // If under 25, displays with informing them that there is a surcharge
        if (age < 25){
            System.out.printf("Since you're under 25, your basic car rental total with the surcharge would be $%.2f.\n", basicRentalTotal);
        }

        // Else, displays without surcharge
        else{
            System.out.printf("Your basic car rental total would be $%.2f.\n", basicRentalTotal);
        }

        // Prints additional price of adding each option if they selected it
        if (elecToll.equals("Yes") || elecToll.equals("yes")){
            System.out.printf("The electronic toll tag is an additional $%.2f.\n", elecTollTotal);
        }

        if (gps.equals("Yes") || gps.equals("yes")) {
            System.out.printf("The GPS is an additional $%.2f.\n", gpsTotal);
        }

        if (roadAssist.equals("Yes") || roadAssist.equals("yes")) {
            System.out.printf("The roadside assistance is an additional $%.2f.\n", roadAssistTotal);
        }

        // Prints total price
        System.out.printf("In total, it'll cost you $%.2f.", totalPrice);
    }

}