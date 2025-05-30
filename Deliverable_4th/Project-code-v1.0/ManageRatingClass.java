import java.util.List;

public class ManageRatingClass {
    private DataBaseManager db = new DataBaseManager();

    public boolean submitRating(int fieldId, String ratingText) {
        return db.submitRating(fieldId, ratingText);
    }

    public List<String> getRatings(int userId) {
        return db.queryRatings(userId);
    }

    public boolean updateRating(int ratingId, String newText) {
        return db.updateRating(ratingId, newText);
    }

    public boolean deleteRating(int ratingId) {
        return db.deleteRating(ratingId);
    }

    public void ConfEditRatingScreen() {
        System.out.println("Rating successfully updated.");
    }

    public void ConfDeleteRatingScreen() {
        System.out.println("Rating successfully deleted.");
    }
}
