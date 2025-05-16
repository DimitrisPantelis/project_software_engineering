public class RegScreen {
    private RegistrationController controller;

    public RegScreen(RegistrationController controller) {
        this.controller = controller;
    }

    public void submitForm(String name, String email, String password, String phone, String address) {
        Account acc = new Account(name, email, password, phone, address);
        boolean isValid = controller.checkDetails(acc);

        if (isValid) {
            controller.saveAccount(acc);
            displayEmailConfirmationScreen();
        } else {
            displayErrorScreen();
        }
    }

    private void displayEmailConfirmationScreen() {
        // εναλλαγή οθόνης
    }

    private void displayErrorScreen() {
        // επιλογή ανάμεσα σε αδύναμο password ή υπάρχον email
    }
}
