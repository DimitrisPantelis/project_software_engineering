public class EditEntryScreen {
    private AdminManageClass manager = new AdminManageClass();

    public void display() {
        System.out.println("Επιλέξτε γήπεδο για επεξεργασία.");
    }

    public void selectEntry(int id) {
        new EditFieldInfoScreen().display(id);
    }
}
