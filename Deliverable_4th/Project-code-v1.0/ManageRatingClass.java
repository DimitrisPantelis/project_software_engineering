
public class ManageRatingClass {
    private int id;
    private int userId;
    private int fieldId;
    private String rating;
    private String comment;

    public void getFields() {
        // Call database or cache to fetch available fields
        System.out.println("Fetching available fields for rating...");
    }

    public void setChoice(int chosenFieldId) {
        this.fieldId = chosenFieldId;
        System.out.println("Selected field ID set to: " + fieldId);
    }

    public void setRating(String rating, String comment) {
        this.rating = rating;
        this.comment = comment;
        System.out.println("Rating and comment set.");
    }

    public void getRatings() {
        // Would typically fetch ratings for a field/user from DB
        System.out.println("Fetching ratings...");
    }

    public void editRating(String newRating, String newComment) {
        this.rating = newRating;
        this.comment = newComment;
        System.out.println("Rating updated.");
    }

    public void changeRating(String newRating) {
        this.rating = newRating;
        System.out.println("Rating changed to: " + rating);
    }
}
