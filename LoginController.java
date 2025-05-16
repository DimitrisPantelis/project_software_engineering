public class LoginController {
    private Database database;

    public LoginController(Database database) {
        this.database = database;
    }

    public String checkCredentials(String email, String password) {
        if (!database.emailExists(email)) {
            return "NO_ACCOUNT";
        }

        if (!database.checkPassword(email, password)) {
            return "WRONG_PASSWORD";
        }

        if (!database.isEmailConfirmed(email)) {
            return "NOT_CONFIRMED";
        }

        return "SUCCESS";
    }

    public void updateLoginData(String email) {
        database.updateLastLogin(email);
    }

    public void sendPasswordResetEmail(String email) {
        database.sendPasswordReset(email);
    }
}