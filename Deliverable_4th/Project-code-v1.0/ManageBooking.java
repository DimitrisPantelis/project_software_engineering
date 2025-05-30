import java.util.List;

public class ManageBooking {
    private int userId;
    private String bookingDetails;
    private String currentDay;
    private List<Booking> currentBookings;
    private DataBaseManager db;

    public void setBookings() {
        List<Booking> newBookings = db.showBookingResults();
        currentBookings = newBookings;

        System.out.println("Οι κρατήσεις ενημερώθηκαν:");
        for (Booking booking : currentBookings) {
            System.out.println("- " + booking.getTitle() + " (" + booking.getDate() + ")");
        }
    }

    public List<String> getBookings(int userId) {
        return List.of("Κράτηση 1", "Κράτηση 2");
    }

    public String getBookingDetails() {
        return bookingDetails;
    }

    public void setDetails(String details) {
        this.bookingDetails = details;
        System.out.println("Νέα στοιχεία αποθηκεύτηκαν.");
    }

    public void cancel() {
        System.out.println("Η κράτηση ακυρώθηκε.");
    }

    public boolean setDay(String newDay) {
        if ("Unavailable".equals(newDay)) {
            return false;
        }
        this.currentDay = newDay;
        System.out.println("Η μέρα άλλαξε επιτυχώς.");
        return true;
    }

    public void EditConfirmationScreen() {
        System.out.println("Η αλλαγή κράτησης επιβεβαιώθηκε.");
    }

    public void SuccessfulCancellationScreen() {
        System.out.println("Η κράτηση ακυρώθηκε επιτυχώς.");
    }

    public void NoAvailableDayScreen() {
        System.out.println("Η νέα μέρα δεν είναι διαθέσιμη.");
    }
}
