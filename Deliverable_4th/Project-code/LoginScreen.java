public class LoginScreen {
    private LoginController controller;

    public LoginScreen(LoginController controller) {
        this.controller = controller;
    }

    public void submitLogin(String email, String password) {
        String status = controller.checkCredentials(email, password);

        switch (status) {
            case "NO_ACCOUNT":
                displayNoAccountScreen();
                break;
            case "WRONG_PASSWORD":
                displayWrongPasswordScreen();
                break;
            case "NOT_CONFIRMED":
                displayUnconfirmedEmailScreen();
                break;
            case "SUCCESS":
                controller.updateLoginData(email);
                goToMainScreen();
                break;
        }
    }

    public void forgotPassword(String email) {
        controller.sendPasswordResetEmail(email);
        displayResetConfirmation();
    }

    private void displayNoAccountScreen() {
        // εναλλαγή σε RegScreen
    }

    private void displayWrongPasswordScreen() {
        // εναλλαγή σε WrongPassScreen
    }

    private void goToMainScreen() {
        // μετάβαση σε MainScreen
    }

    private void displayResetConfirmation() {
        // εμφανίζει επιβεβαίωση αποστολής
    }

    private void displayUnconfirmedEmailScreen() {
        // Εδώ μπορείς να εμφανίσεις μήνυμα: "Παρακαλώ επιβεβαιώστε το email σας"
        System.out.println("Ο λογαριασμός σας δεν έχει επιβεβαιωθεί μέσω email.");
    }
}
