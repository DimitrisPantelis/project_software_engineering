public class RegistrationController {
    private Database database;

    public RegistrationController(Database db) {
        this.database = db;
    }

    public boolean checkDetails(Account account) {
        // Ελέγχει αν το email υπάρχει ήδη ή αν ο κωδικός είναι αδύναμος
        if (database.emailExists(account.getEmail())) {
            return false;
        }
        return isStrongPassword(account.getPassword());
    }

    private boolean isStrongPassword(String password) {
        return password.length() >= 8; // Βασικός έλεγχος
    }

    public void saveAccount(Account account) {
        database.saveAccount(account);
    }

    public boolean validateLink(String token) {
        return database.validateConfirmationLink(token);
    }
}
