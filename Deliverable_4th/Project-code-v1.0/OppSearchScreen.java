import java.util.List;

public class OppSearchScreen {
    private ManageOpponent manager = new ManageOpponent();

    public void display() {
        System.out.println("Αναζήτηση για διαθέσιμους αντιπάλους...");
    }

    public List<String> getOppBookingList() {
        return manager.getOppBooking();
    }
}
