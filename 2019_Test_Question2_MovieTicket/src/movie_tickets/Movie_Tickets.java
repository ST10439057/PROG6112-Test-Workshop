package movie_tickets;

import java.util.Scanner;

public class Movie_Tickets {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name and read the input
        System.out.println("Enter the customer name:");
        String name = scanner.nextLine();

        // Ask the user for the movie name and read the input
        System.out.println("Enter the movie name:");
        String movie = scanner.nextLine();

        // Ask the user for the customer's age and read the input
        System.out.println("Enter the customer age:");
        int age = scanner.nextInt();

        // Ask the user for the ticket price and read the input
        System.out.println("Enter the movie cost:");
        double cost = scanner.nextDouble();

        // Create a TicketSales object with the input data
        TicketSales tickersales = new TicketSales(name, movie, age, cost);

        // Call the print_tickets method to display the ticket details
        tickersales.print_tickets();
    }
}

