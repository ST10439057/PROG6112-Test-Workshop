package pkg2022_test_question2_usestaff;

import java.util.Scanner;

// UseStaff class to instantiate the StaffHiring class
public class UseStaff {

    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the current staff number
        System.out.print("Enter the current staff number: ");
        int staffNumber = scanner.nextInt();

        // Consume the remaining newline character
        scanner.nextLine();

        // Prompt the user to enter the staff hiring location
        System.out.print("Enter the staff hiring location: ");
        String staffLocation = scanner.nextLine();
        // Leave a line
        System.out.println();

        // Instantiate the StaffHiring class using the entered data
        StaffHiring staffHiring = new StaffHiring(staffNumber, staffLocation);

        // Print the staff hiring report
        staffHiring.printStaffHiring();

        // Close the scanner to avoid resource leak
        scanner.close();
    }

}

