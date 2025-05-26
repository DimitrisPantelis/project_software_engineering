import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeScreen extends ManageDateAndTimeClass {


    public DateAndTimeScreen() {
        super(); // κλήση του constructor της υπερκλάσης
    }

    public void display() {
        System.out.println("Reservation Date: " + setDate());
        System.out.println("Reservation Time: " + setTime());
    }

    public void showResults() {
        // Π.χ. εμφάνιση αποτελεσμάτων κρατήσεων για την ημερομηνία/ώρα
        super.showResults();
    }
    public void backButton() {
        System.out.println("Back");
    }

    public void continueButton() {
        System.out.println("Continue");
    }
}
