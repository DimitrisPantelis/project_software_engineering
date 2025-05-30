public class AdminLogin {
    private AdminManageClass adminManager = new AdminManageClass();

    public void display() {
        System.out.println("Admin login screen.");
    }

    public boolean login(String username, String password) {
        return adminManager.checkCredentials(username, password);
    }
}
