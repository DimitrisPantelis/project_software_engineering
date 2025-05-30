public class NewFieldEntryScreen {
    private AdminManageClass manager = new AdminManageClass();

    public void display() {
        System.out.println("Καταχώρηση νέου γηπέδου");
    }

    public void submit(String fieldInfo) {
        if (manager.validateFieldInfo(fieldInfo)) {
            manager.submitField(fieldInfo);
            manager.SuccessEntryScreen();
        }
    }
}
