import java.util.List;

public class AdminManageClass {
    private int id;
    private String name;
    private String password;
    private String address;
    private String email;

    public AdminManageClass(int id, String name, String password, String address, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
        this.email = email;
    }

    private DataBaseManager db = new DataBaseManager();

    public String getCredentials(String name, String password) {
        return db.queryAdminLoginForm();
    }

    public boolean setCredentials() {
        return db.checkAdminCredentials(name, password);
    }

    public boolean checkInfo(String info) {
        return db.validateEntry(info);
    }

    public void setChoice(String action, Field field) {
        if (action.equalsIgnoreCase("insert")) {
            db.insertNewField(field);
        } else if (action.equalsIgnoreCase("edit")) {
            db.updateField(field);
        } else {
            System.out.println("Άγνωστη ενέργεια: " + action);
        }
    }

    public boolean getEntryInfo(String info) {
        return db.submitEntry(info);
    }

    public List<String> getAvailableFields() {
        return db.queryEntryList();
    }

    public boolean changeInfo(int id, String newInfo) {
        return db.updateFieldInfo(id, newInfo);
    }

    public void SuccessEntryScreen() {
        System.out.println("Το γήπεδο καταχωρήθηκε επιτυχώς.");
    }

    public void SuccessEditScreen() {
        System.out.println("Η επεξεργασία γηπέδου ολοκληρώθηκε.");
    }
}