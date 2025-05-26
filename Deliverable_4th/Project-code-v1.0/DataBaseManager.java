<<<<<<< HEAD
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class DataBaseManager {
=======
import java.util.List;

public class DataBaseManager(){

    public boolean submit(){
        return true;
>>>>>>> d7934bffe88dce4b71fc26a3e977d7a502335bee

    // === USER AUTHENTICATION ===

    public boolean submit() {
        // TODO: Implement logic
        return true;
    }

    public boolean checkCredentials(String username, String password) {
        // TODO: Validate user credentials
        return false;
    }

    public boolean checkEmail(String email) {
        // TODO: Check if email format is valid
        return true;
    }

<<<<<<< HEAD
    public boolean queryEmail(String email) {
        // TODO: Query if email exists in the database
=======
    public void querySport(String sport){
        // Query στη ΒΔ
        return null;
    }

    public void queryCourts(String region){
        // Query στη ΒΔ
        return null;
    }

    public boolean submitDate(date submitDate){
>>>>>>> d7934bffe88dce4b71fc26a3e977d7a502335bee
        return true;
    }

    public String queryAdminLoginForm() {
        // TODO: Fetch admin login form (HTML or serialized object?)
        return "";
    }

    public boolean validateInfo(Object userInfo) {
        // TODO: Validate given user info object
        return true;
    }

<<<<<<< HEAD
    // === SPORT & COURT QUERIES ===

    public void querySport(String sport) {
        // TODO: Fetch sport-related data
    }

    public void queryCourts() {
        // TODO: Fetch court availability
    }

    public String queryFields() {
        // TODO: Return field names or metadata
        return "";
    }

    // === BOOKINGS ===

    public boolean submitDate(LocalDate date) {
        // TODO: Store booking date
        return true;
    }

    public boolean submitTime(LocalTime time) {
        // TODO: Store booking time
        return true;
    }

    public void queryBookings() {
        // TODO: Retrieve all bookings
    }

    public String queryBookingDetails() {
        // TODO: Return details of a specific booking
        return "";
    }

    public boolean submitDetails(Object details) {
        // TODO: Save detailed booking info
        return true;
    }

    public boolean submitCancellation(int bookingId) {
        // TODO: Cancel a booking by ID
        return true;
    }

    public boolean submitDay(LocalDate date) {
        // TODO: Submit day availability or selection
        return true;
    }

    public void queryOppBooking() {
        // TODO: Query for opponent bookings
    }

    public void queryParticipationForm() {
        // TODO: Get form for participation
    }

    public boolean setToComplete(int bookingId) {
        // TODO: Mark booking as completed
        return true;
    }

    public boolean setToRequestOpp(int bookingId) {
        // TODO: Mark booking as request for opponent
        return true;
    }

    // === RATINGS ===

    public boolean publishRating(int bookingId, int stars, String comment) {
        // TODO: Save rating
        return true;
    }

    public void queryRatings() {
        // TODO: Retrieve ratings
    }

    public boolean updateRating(int ratingId, int newStars, String newComment) {
        // TODO: Update an existing rating
        return true;
    }

    // === MISC ===

    public void submitEntry(Object entryData) {
        // TODO: Submit a new generic entry
    }

    public boolean queryEntryInfo(int entryId) {
        // TODO: Get entry info
        return true;
    }

    public boolean submitInfo(Object info) {
        // TODO: Submit general information
        return true;
    }
}
=======
    
    
}
>>>>>>> d7934bffe88dce4b71fc26a3e977d7a502335bee
