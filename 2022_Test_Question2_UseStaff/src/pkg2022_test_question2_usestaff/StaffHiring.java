
package pkg2022_test_question2_usestaff;

// Subclass StaffHiring that extends Staff
class StaffHiring extends Staff 
{
    // Constructor to initialize staffNumber and staffLocation
    public StaffHiring(int staffNumber, String staffLocation) {
        super(staffNumber, staffLocation); // Call the constructor of the superclass
    }

    // Implement the method to determine the staff hiring process
    @Override
    public String getStaffHiringProcess() {
        // If the number of staff is less than 20, the company should hire more staff
        if (staffNumber < 20) {
            return "HIRE STAFF: YES";
        } else {
            return "HIRE STAFF: NO";
        }
    }

    // Method to print staff hiring report
    public void printStaffHiring() {
        // Print the staff hiring report with the details of the staff number, location, and process
        System.out.println("STAFF HIRING REPORT");
        System.out.println("*************************");
        System.out.println("LOCATION: " + getStaffLocation());
        System.out.println("STAFF NUMBER: " + getStaffNumber());
        System.out.println(getStaffHiringProcess()); // Display the hiring process
    }
}

