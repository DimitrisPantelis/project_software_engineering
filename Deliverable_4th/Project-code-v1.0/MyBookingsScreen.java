import java.util.List;

public class MyBookingsScreen {
    private ManageBooking manager = new ManageBooking();

    public void display() {
        System.out.println("Οθόνη προβολής κρατήσεων χρήστη.");
    }

    public List<String> getBookings(int userId) {
        return manager.getBookings(userId);
    }
}
