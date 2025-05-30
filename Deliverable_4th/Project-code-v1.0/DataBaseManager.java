import java.util.*;

import javax.smartcardio.Card;

public class DataBaseManager {

    private Map<Integer, String> fields = new HashMap<>();
    private Map<Integer, String> bookings = new HashMap<>();
    private Map<Integer, String> users = new HashMap<>();
    private Map<Integer, String> ratings = new HashMap<>();
    private Map<Integer, String> tournaments = new HashMap<>();

    public boolean checkCredentials(String username, String password) {
        return users.containsKey(username.hashCode()) && users.get(username.hashCode()).equals(password);
    }

    public boolean checkAdminCredentials(String username, String password) {
        return username.equals("admin") && password.equals("1234");
    }

    public List<String> querySport() {
        return Arrays.asList("Soccer", "Basketball", "Tennis");
    }

    public List<String> queryFields() {
        return new ArrayList<>(fields.values());
    }

    public boolean validateEntry(String info) {
        return info != null && !info.trim().isEmpty();
    }

    public boolean submitEntry(String info) {
        int id = fields.size() + 1;
        fields.put(id, info);
        return true;
    }

    public List<String> queryEntryList() {
        return new ArrayList<>(fields.values());
    }

    public boolean updateFieldInfo(int id, String newInfo) {
        if (fields.containsKey(id)) {
            fields.put(id, newInfo);
            return true;
        }
        return false;
    }

    public List<String> queryBookings(String userId) {
        // Normally filtered by userId
        return new ArrayList<>(bookings.values());
    }

    public String queryBookingDetails(int bookingId) {
        return bookings.getOrDefault(bookingId, "N/A");
    }

    public boolean updateBookingDetails(int bookingId, String newDetails) {
        if (bookings.containsKey(bookingId)) {
            bookings.put(bookingId, newDetails);
            return true;
        }
        return false;
    }

    public boolean cancelBooking(int bookingId) {
        return bookings.remove(bookingId) != null;
    }

    public boolean isDayAvailable(int bookingId, String newDay) {
        return !newDay.equalsIgnoreCase("Sunday");
    }

    public List<String> queryOppBookings() {
        return new ArrayList<>(bookings.values());
    }

    public String queryParticipationForm(int bookingId) {
        return "Form for booking " + bookingId;
    }

    public boolean setToCompleted(int bookingId) {
        // simulate status update
        return true;
    }

    public boolean setToRequest(int bookingId) {
        // simulate request status
        return true;
    }

    public boolean submitRating(int fieldId, String ratingText) {
        int id = ratings.size() + 1;
        ratings.put(id, ratingText);
        return true;
    }

    public List<String> queryRatings(int userId) {
        return new ArrayList<>(ratings.values());
    }

    public boolean updateRating(int ratingId, String newText) {
        if (ratings.containsKey(ratingId)) {
            ratings.put(ratingId, newText);
            return true;
        }
        return false;
    }

    public boolean deleteRating(int ratingId) {
        return ratings.remove(ratingId) != null;
    }

    public List<String> queryTournaments() {
        return new ArrayList<>(tournaments.values());
    }

    public boolean addToTournamentList(String userId) {
        // simulate addition to list
        return true;
    }

    public boolean saveTournamentParticipation(String userId, String tournamentDetails) {
        return true;
    }

    public boolean hasUserAlreadyParticipated(String userId, String tournamentId) {
        return false; // stub
    }

    public boolean sendEmail(String email, String content) {
        System.out.println("Sending email to: " + email);
        System.out.println("Content: " + content);
        return true;
    }

    public User queryEditProfile(int userId) {
        // Placeholder: επιστρέφει user με demo στοιχεία
        return new User(userId, "tester", "user", "user@example.com", "password", "666666666");
    }

    public boolean updateProfile(User updatedUser) {
        // Placeholder: ενημέρωση στη βάση
        System.out.println("Profile saved to DB: " + updatedUser.getEmail());
        return true;
    }

    public List<Card> queryCardDetails(int userId) {
        // Επιστρέφει κάρτες για έναν χρήστη
        return List.of(new Card("1111222233334444", "123"));
    }

    public boolean updatePaymentStatus(int bookingId, String status) {
        System.out.println("Payment status for booking " + bookingId + " updated to: " + status);
        return true;
    }

    public boolean submitTournamentParticipation(int tournId, int userId) {
        System.out.println("Tournament " + tournId + " joined by user " + userId);
        return true;
    }

    public boolean addUserToTournamentNotifyList(int userId) {
        System.out.println("User " + userId + " added to notification list.");
        return true;
    }

    public boolean checkTournamentParticipation(int tournId, int userId) {
        return false;
    }

    public List<Pin> queryPins() {
        // Mock pins
        return List.of(new Pin(/* ... */));
    }

    public Field queryPinInfo(int pinId) {
        return new Field("...", "...", "...", "...");
    }

    public String queryMoreInfo(int fieldId) {
        return "Locker room, Parking, Open hours: 9am–11pm";
    }

    public Route queryRoute(Location from, Field to) {
        return new Route("Head north on Main Street, then turn right...");
    }

    public List<Field> queryResults(String search) {
        return List.of(
                new Field(1, "Court A", "Address A", "Tennis"),
                new Field(2, "Court B", "Address B", "Football"));
    }
}
