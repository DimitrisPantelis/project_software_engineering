public class ManageProfileClass {

    private String phoneNumber;
    private String profilePicturePath;  

    public ManageProfileClass( String phoneNumber, String profilePicturePath) {
        this.phoneNumber = phoneNumber;
        this.profilePicturePath = profilePicturePath;
    }

    // Επιλογή τι θέλεις να αλλάξεις (π.χ. "name", "photo", "email")
    public void setChoice(String choice) {
        System.out.println("Επιλέχθηκε η αλλαγή του: " + choice);
    }

    // Επιστρέφει τα τωρινά στοιχεία του προφίλ
    public void getEditProfile() {
        System.out.println("=== Τρέχον Προφίλ ===");
        System.out.println("Τηλέφωνο: " + phoneNumber);
        System.out.println("Φωτογραφία προφίλ: " + profilePicturePath);
    }

    // Ενημέρωση στοιχείων προφίλ
    public void setInfo(String newUsername, String newEmail, String newPhoneNumber, String newProfilePicturePath) {
        if (newPhoneNumber != null && !newPhoneNumber.isEmpty()) {
            this.phoneNumber = newPhoneNumber;
        }
        if (newProfilePicturePath != null && !newProfilePicturePath.isEmpty()) {
            this.profilePicturePath = newProfilePicturePath;
        }
        System.out.println("Τα στοιχεία του προφίλ ενημερώθηκαν με επιτυχία.");
    }

     // Getters (προαιρετικά)
}

