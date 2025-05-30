import java.util.List;

public class ManageOpponent {
    public List<String> getAvailableBookings() {
        return List.of("Booking 101", "Booking 102");
    }

    public String getParticipationForm(int bookingId) {
        return "Form for booking #" + bookingId;
    }

    public boolean setCompleted(int bookingId, int count) {
        System.out.println("Συμμετοχή ολοκληρώθηκε για " + count + " άτομα.");
        return true;
    }

    public void setToRequest(int bookingId) {
        System.out.println("Κράτηση " + bookingId + " τέθηκε σε αναμονή αντιπάλου.");
    }

    public void ParticipationConfScreen() {
        System.out.println("Η συμμετοχή ολοκληρώθηκε με επιτυχία!");
    }

    public void NoOpponentScreen() {
        System.out.println("Δεν βρέθηκε αντίπαλος για αυτή την κράτηση.");
    }
}
