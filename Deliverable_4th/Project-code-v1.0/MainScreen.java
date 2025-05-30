public class MainScreen {
    private FieldsScreen fieldsScreen;

    public void display() {
        System.out.println("Καλωσήρθατε στην εφαρμογή!");
    }

    public void chooseSport(String sport) {
        fieldsScreen = new FieldsScreen();
        fieldsScreen.display();
        fieldsScreen.getSport(sport);
    }
}
