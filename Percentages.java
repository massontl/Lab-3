// Programmer: Masson Lopez
// Date: September 13, 2023
// Lab 3
// Instructor: Dr. Rafael Azuaje
// College: NLC

public class Percentages {
    public static void main(String[] args) {
        // Declare and assign values to two double variables
        double num1 = 11.0;
        double num2 = 23.0;

        // Call computePercent method twice with different order of arguments
        computePercent(num1, num2);
        computePercent(num2, num1);
    }

    // Method to compute and display the percentage relationship
    public static void computePercent(double num1, double num2) {
        double percentage = (num1 / num2) * 100;
        System.out.println(num1 + " is " + percentage + " percent of " + num2 + ".");
    }
}
