package pkg2019_test_question1_vehiclesalesreport;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Creating a scanner object
        Scanner scanner = new Scanner(System.in);

        // declaring an inicalizing a 2D array for vehicle Sales data
        int[][] vehicleSalesArray = { // 8 marks
            {25, 15, 35},
            {25, 55, 35},
            {11, 20, 45},
            {17, 27, 25},};

        // declaring an inicalizing an array for months
        String[] months = {"JAN", "FEB", "MAR"};

        // declaring an inicalizing an array for vehicle Type
        String[] vehicleType = {"SUV", "COUPE", "SEDAN", "VAN"};
        // declaring an inicalizing an array to hold the total sales fot each vehicle Type
        int[] vehicleTotalSales = new int[4];

        // Print out top boarder with heading and bottom boarder
        System.out.println("***********************************************");
        System.out.println("VEHICLE SALES REPORT");
        System.out.println("***********************************************");

        // Print column headings 
        System.out.printf("%-10s", "");
        for (String month : months) {
            System.out.printf("%-15s", month);
        }

        for (int row = 0; row < vehicleType.length; row++) {
            System.out.printf("\n%-10s", vehicleType[row]);

            for (int col = 0; col < months.length; col++) {
                System.out.printf("%-15d", vehicleSalesArray[row][col]);
            }

        }
        System.out.println("");
        System.out.println("***********************************************");

        System.out.println("VEHICLE TOTAL SALES");

        System.out.println("***********************************************");
        // vechile total sales
        for (int row = 0; row < vehicleType.length; row++) {
            vehicleTotalSales[row] = vehicleSalesArray[row][0] + vehicleSalesArray[row][1] + vehicleSalesArray[row][2];
        }

        for (int row = 0; row < vehicleType.length; row++) {
            if (vehicleTotalSales[row] > 99) {
                System.out.println(vehicleType[row] + "\t" + vehicleTotalSales[row] + "\t (Gold Star)");
            } else {
                System.out.println(vehicleType[row] + "\t" + vehicleTotalSales[row] + "\t (Silver Star)");
            }

        }
        System.out.println("***********************************************");

        scanner.close();
    }

}
