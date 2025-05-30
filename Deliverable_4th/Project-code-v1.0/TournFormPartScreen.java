public class TournFormPartScreen {
    public void display() {
        System.out.println("Form to enter tournament details");
    }

    public void setDetails(Tournament tournament) {
        System.out.println("Details submitted for: " + tournament.getName());
    }
}
