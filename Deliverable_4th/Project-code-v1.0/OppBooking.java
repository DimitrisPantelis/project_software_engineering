public class OppBooking {
    private ManageOpponent manager = new ManageOpponent();

    public void display() {
        System.out.println("Οθόνη επιλογής κράτησης για συμμετοχή.");
    }

    public void selectBooking(int bookingId) {
        String form = manager.getParticipationForm(bookingId);
        new ParticipationForm().display();
    }
}
