public class AdminMainScreen {
    public void display() {
        System.out.println("Admin Main Menu");
    }

    public void chooseNewEntry() {
        new NewFieldEntryScreen().display();
    }

    public void chooseEditEntry() {
        new EditEntryScreen().display();
    }
}
