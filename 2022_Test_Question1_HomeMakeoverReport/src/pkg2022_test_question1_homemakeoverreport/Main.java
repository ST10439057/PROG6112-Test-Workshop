package pkg2022_test_question1_homemakeoverreport;

public class Main {

    public static void main(String[] args) {
        // Define the months and the types of home makeovers
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};
        String[] makeoverTypes = {"Bathrooms", "Kitchens", "Garden"};

        // Initialize the 2D array with the provided data
        int[][] homeMakeovers = {
            //(Bathrooms, Kitchens, Garden)
            {8, 2, 5}, // JAN 
            {7, 4, 5}, // FEB
            {5, 5, 2}, // MAR
            {2, 2, 3}, // APR
            {7, 7, 9}, // MAY
            {7, 8, 5} // JUN
        };

        // Print out top border with heading and bottom border for the report
        System.out.println("------------------------------------------------------------");
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("------------------------------------------------------------");

        // Print column headings for the table
        System.out.printf("%-10s", "     ");
        for (String makeover : makeoverTypes) {
            System.out.printf("%-15s", makeover);
        }
        System.out.println();

        // Loop through the homeMakeovers array and display the data
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-10s", months[i]);

            for (int j = 0; j < makeoverTypes.length; j++) {
                System.out.printf("%-15d", homeMakeovers[i][j]);
            }
            System.out.println();
        }

        // Print a separator line before displaying monthly totals
        System.out.println("------------------------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("------------------------------------------------------------");

        // Array to store the total makeovers per month
        int[] monthlyTotals = new int[months.length];

        // Loop to calculate the total makeovers for each month
        for (int i = 0; i < months.length; i++) {
            int total = 0;
            for (int j = 0; j < makeoverTypes.length; j++) {
                total += homeMakeovers[i][j]; // Sum the makeovers for the month
            }
            monthlyTotals[i] = total; // Store the total for each month
        }

        // Loop through the monthly totals and display them
        for (int i = 0; i < monthlyTotals.length; i++) {
            System.out.printf("%-10s", months[i]);
            System.out.printf("%-10d", monthlyTotals[i]);

            // Print stars if the total is 15 or more
            if (monthlyTotals[i] >= 15) {
                System.out.println(" ***");
            } else {
                System.out.println();
            }
        }
        System.out.println("------------------------------------------------------------");
    }

}
