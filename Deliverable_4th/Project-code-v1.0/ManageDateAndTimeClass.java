import java.time.LocalDate;
import java.time.LocalTime;

public class ManageDateAndTimeClass {

    private LocalDate reservationDate;
    private LocalTime reservationTime;

    public ManageDateAndTimeClass() {
        // Προαιρετικά default values
        this.reservationDate = LocalDate.now();
        this.reservationTime = LocalTime.now();
    }
    
    public Date setDate(LocalDate date){
        this.reservationDate = date;
    }

    public void showResults(){
        // Π.χ. εμφάνιση αποτελεσμάτων κρατήσεων για την ημερομηνία/ώρα
        System.out.println("Αποτελέσματα για " + reservationDate + " στις " + reservationTime);
    }
    
    public Time setTime(LocalTime time){
        this.reservationTime = time;
    }
    
}
