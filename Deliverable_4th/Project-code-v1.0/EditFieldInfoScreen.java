public class EditFieldInfoScreen {
    private AdminManageClass manager = new AdminManageClass();

    public void display(int id) {
        System.out.println("Επεξεργασία γηπέδου #" + id);
    }

    public void submitChanges(int id, String newInfo) {
        if (manager.updateField(id, newInfo)) {
            manager.SuccessEditScreen();
        }
    }
}
