
package movie_tickets;

// TicketSales class extends the Tickets abstract class
// This class implements the print_tickets method from the iTickets interface
public class TicketSales extends Tickets {

    // Constructor to initialize TicketSales objects
    // Calls the constructor of the superclass (Tickets) to initialize customer and ticket details
    public TicketSales(String customerName, String movieTitle, int customerAge, double price) {
        super(customerName, movieTitle, customerAge, price);
    }

    // Implementation of the print_tickets method from iTickets interface
    @Override
    public void print_tickets() {
        // Print the customer's name, movie title, and the ticket price
        System.out.println();
        System.out.println("CUSTOMER: " + getCustomerName());
        System.out.println("MOVIE: " + getMovieTitle());
        System.out.println("COST: R" + getPrice());
        
        // Calculate discount for senior citizens (age 65 and above)
        double discount = 0;
        if(getCustomerAge() >= 65){
           discount = getPrice() * 0.10; // 10% discount for customers aged 65 or older
        }
        
        // Print the discount value
        System.out.println("DISCOUNT: R" + discount);
        
        // Print the total cost after applying the discount
        System.out.println("TOTAL: R" + (getPrice() - discount));
    }
}

