public class NewFieldEntryScreen {
    private AdminManageClass manager = new AdminManageClass(0, null, null, null, null);

    public void display() {
        System.out.println("Καταχώρηση νέου γηπέδου");
    }

    public void submit(String fieldInfo) {
        if (manager.checkInfo(fieldInfo)) {
            manager.setChoice(fieldInfo, null);
            manager.SuccessEntryScreen();
        }
    }
}
