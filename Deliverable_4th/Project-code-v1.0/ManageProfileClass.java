public class ManageProfileClass {
    private DataBaseManager db = new DataBaseManager();

    public boolean submitProfileAccess(int userId) {
        // Πιθανόν logging/αρχικοποίηση
        return true;
    }

    public User getEditProfile(int userId) {
        return db.queryEditProfile(userId);
    }

    public boolean checkInfo(User editedUser) {
        // Έλεγχος εγκυρότητας: π.χ. email format, κενά πεδία κλπ
        if (editedUser.getEmail() == null || !editedUser.getEmail().contains("@")) {
            return false;
        }
        return true;
    }

    public boolean saveEditedProfile(User editedUser) {
        return db.updateProfile(editedUser);
    }

    public void ConfUpdateScreen() {
        System.out.println("Profile updated successfully.");
    }

    public void InvalidDataScreen() {
        System.out.println("Invalid input. Please try again.");
    }
}
