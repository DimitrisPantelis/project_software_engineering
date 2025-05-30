public class ManageProfileClass {
    private DataBaseManager db = new DataBaseManager();

    public User getEditProfile(int userId) {
        return db.queryEditProfile(userId);
    }

    public boolean setInfo(User editedUser) {
        return true;
    }

    public boolean getEditedProfile(User editedUser) {
        return db.updateProfile(editedUser);
    }

    public void ConfUpdateScreen() {
        System.out.println("Profile updated successfully.");
    }

    public void InvalidDataScreen() {
        System.out.println("Invalid input. Please try again.");
    }
}
