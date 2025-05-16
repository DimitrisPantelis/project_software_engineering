import java.util.List;

public class Database {
    public boolean emailExists(String email) {
        // Έλεγχος αν υπάρχει email
        return false;
    }

    public void saveAccount(Account account) {
        // Αποθήκευση λογαριασμού
    }

    public boolean validateConfirmationLink(String token) {
        // Έλεγχος εγκυρότητας συνδέσμου
        return true;
    }

    public boolean checkPassword(String email, String password) {
        // έλεγχος password
        return true;
    }

    public boolean isEmailConfirmed(String email) {
        return true;
    }

    public void updateLastLogin(String email) {
        // ενημέρωση τελευταίας σύνδεσης
    }

    public void sendPasswordReset(String email) {
        // αποστολή email αλλαγής
    }

    public List<Court> findCourtsBySport(String sport) {
        // Query στη ΒΔ
        return null;
    }

    public List<Court> findCourtsByRegion(String region) {
        // Query στη ΒΔ
        return null;
    }

    public List<Court> findCourtsByFilters(String sport, String region, boolean sortByPrice) {
        // Συνδυαστική αναζήτηση
        return null;
    }

    public boolean checkAvailability(String courtId) {
        // Check στη ΒΔ
        return true;
    }
}
