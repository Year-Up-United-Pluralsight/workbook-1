package com.pluralsight;

public class MathApp {

    public static void main(String[] args){

        // Question 1:
            // declare variables here
            // then code solution
            // then use System.out.println() to display results
            // ex: System.out.println("The answer is " + answer);
            // REPEAT FOR NEXT EXERCISE
        double bobSalary = 70000;
        double garySalary = 85000;

        double highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The answer is " + highestSalary);

        ///////////////////////////////////////////////////////

        // Question 2:
        System.out.println("Determine whose salary is greater using Math.max() and\n" +
                "store the answer in highestSalary. Set the initial salary variables to any value\n" +
                "you want.");

        double carPrice = 20_000;
        double truckPrice = 35_000;

        double smallest_price = Math.min(carPrice, truckPrice);

        System.out.println("The answer is " + smallest_price);

        // Question 3:
        System.out.println("Find and display the area of a circle whose radius is 7.25");

        double area_of_circle = Math.PI * Math.pow(7.25,2);

        System.out.println("The answer is " + area_of_circle);

        // Question 4:
        System.out.println("Find and display the square root a variable after it is set to 5.0");

        double num1 = 5.0;
        double square_root = Math.sqrt(num1);

        System.out.println("The answer is " + square_root);

        // Question 5:
        System.out.println("Find and display the distance between the points (5, 10) and (85, 50)");

        int x1 = 5;
        int y1 = 10;

        int x2 = 85;
        int y2 = 50;

        int diff_x = 5 + 85;
        int x_squared = diff_x * diff_x;

        int diff_y = 10 + 50;
        int y_squared = diff_y * diff_y;

        double distance = Math.sqrt(x_squared + y_squared);

        System.out.println("The answer is " + distance);

        // Question 6:
        System.out.println("Find and display the absolute (positive) value of a variable after it is set to -3.8");

        double negative_num = -3.8;

        double absolute_value = Math.abs(negative_num);

        System.out.println("The answer is " + absolute_value);

        // Question 7:
        System.out.println("Find and display a random number between 0 and 1.");

        double random_number = Math.random();
        double final_rand_num = random_number * 10;

        System.out.println  ("The answer is " + final_rand_num);
    }

}
