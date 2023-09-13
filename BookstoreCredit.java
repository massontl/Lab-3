// Programmer: Masson Lopez
// Date: September 13, 2023
// Lab 3
// Instructor: Dr. Rafael Azuaje
// College: NLC

import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the student's name
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        // Prompt the user for the student's grade point average
        System.out.print("Enter student's grade point average: ");
        double gpa = scanner.nextDouble();

        // Calculate the bookstore credit (10 times the GPA)
        double credit = gpa * 10;

        // Display the descriptive message
        displayMessage(studentName, gpa, credit);

        // Close the scanner
        scanner.close();
    }

    // Method to display the descriptive message
    public static void displayMessage(String name, double gpa, double credit) {
        System.out.println(name + ", with a GPA of " + gpa + ", receives a bookstore credit of $" + credit);
    }
}
