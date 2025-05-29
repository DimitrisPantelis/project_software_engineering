public class AdminManageClass extends User{

    private String username;
    private String password;
    private String adminInfo; 

    // === CREDENTIALS ===

    public void setCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String[] getCredentials() {
        return new String[]{username, password};
    }

    public boolean checkCredentials(String inputUser, String inputPass) {
        return this.username.equals(inputUser) && this.password.equals(inputPass);
    }

    // === INFO MANAGEMENT ===

    public void setInfo(String info) {
        this.adminInfo = info;
    }

    public String getInfo() {
        return adminInfo;
    }

    public boolean checkInfo(String value) {
        return adminInfo != null && adminInfo.contains(value);
    }

    public void changeInfo(String newInfo) {
        this.adminInfo = newInfo;
    }

    public void getEntryInfo() {
        // TODO: Fetch or display entry info related to admin
    }
}

