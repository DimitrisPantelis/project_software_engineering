public class AdminLogin {
    private DataBaseManager db = new DataBaseManager();

    public void display() {
        System.out.println("Admin login screen.");
    }

    public boolean login(String username, String password) {
        return db.checkAdminCredentials(username, password);
    }
}
