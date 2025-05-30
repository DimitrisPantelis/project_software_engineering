import java.util.List;

public class AdminManageClass {
    private DataBaseManager db = new DataBaseManager();

    public boolean checkCredentials(String user, String pass) {
        return db.checkAdminCredentials(user, pass);
    }

    public boolean validateFieldInfo(String info) {
        return db.validateEntry(info);
    }

    public boolean submitField(String info) {
        return db.submitEntry(info);
    }

    public List<String> getAvailableFields() {
        return db.queryEntryList();
    }

    public boolean updateField(int id, String newInfo) {
        return db.updateFieldInfo(id, newInfo);
    }

    public void SuccessEntryScreen() {
        System.out.println("Το γήπεδο καταχωρήθηκε επιτυχώς.");
    }

    public void SuccessEditScreen() {
        System.out.println("Η επεξεργασία γηπέδου ολοκληρώθηκε.");
    }
}