// Programmer: Masson Lopez
// Date: September 13, 2023
// Lab 3
// Instructor: Dr. Rafael Azuaje
// College: NLC

public class NumbersDemo {
    public static void main(String[] args) {
        // Declare and assign values to two integer variables
        int num1 = 11;
        int num2 = 23;

        // Call methods to display results
        displayTwiceTheNumber(num1);
        displayTwiceTheNumber(num2);

        displayNumberPlusFive(num1);
        displayNumberPlusFive(num2);
    }

    // Method to display twice the input number
    public static void displayTwiceTheNumber(int number) {
        int result = number * 2;
        System.out.println("Twice the number " + number + " is: " + result);
    }

    // Method to display the input number plus five
    public static void displayNumberPlusFive(int number) {
        int result = number + 5;
        System.out.println("Number " + number + " plus five is: " + result);
    }
}
