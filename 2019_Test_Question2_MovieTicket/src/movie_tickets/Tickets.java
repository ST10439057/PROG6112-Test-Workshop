
package movie_tickets;


// Abstract class Tickets implements the iTickets interface
abstract class Tickets implements iTickets {
    
    // Private variables to store customer information and ticket details
    private String customerName; // Name of the customer
    private String movieTitle;   // Title of the movie
    private int customerAge;     // Age of the customer
    private double price;        // Price of the ticket

    // Constructor to initialize the customer details and ticket price
    public Tickets(String customerName, String movieTitle, int customerAge, double price) {
        this.customerName = customerName;  // Set the customer name
        this.movieTitle = movieTitle;      // Set the movie title
        this.customerAge = customerAge;    // Set the customer's age
        this.price = price;                // Set the price of the ticket
    }

    // Getter method to retrieve the customer's name
    public String getCustomerName() {
        return customerName;
    }

    // Getter method to retrieve the movie title
    public String getMovieTitle() {
        return movieTitle;
    }

    // Getter method to retrieve the customer's age
    public int getCustomerAge() {
        return customerAge;
    }

    // Getter method to retrieve the price of the ticket
    public double getPrice() {
        return price;
    }    
}


