public class EditFieldInfoScreen {
    private AdminManageClass manager = new AdminManageClass(0, null, null, null, null);

    public void display(int id) {
        System.out.println("Επεξεργασία γηπέδου #" + id);
    }

    public void submitChanges(int id, String newInfo) {
        if (manager.changeInfo(id, newInfo)) {
            manager.SuccessEditScreen();
        }
    }
}
