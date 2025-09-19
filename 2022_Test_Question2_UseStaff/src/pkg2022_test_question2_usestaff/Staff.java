package pkg2022_test_question2_usestaff;

// Abstract class Staff implementing iStaff interface
abstract class Staff implements iStaff 
{
     int staffNumber; // Variable to store the number of staff members
     String staffLocation; // Variable to store the location of staff

    // Constructor to initialize staffNumber and staffLocation
    public Staff(int staffNumber, String staffLocation) {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }

    // Getter method for staff number
     @Override
    public int getStaffNumber() {
        return staffNumber;
    }

    // Getter method for staff location
     @Override
    public String getStaffLocation() {
        return staffLocation;
    }

    // Abstract method to get the staff hiring process (implemented in subclass)
     @Override
    public abstract String getStaffHiringProcess();
}


