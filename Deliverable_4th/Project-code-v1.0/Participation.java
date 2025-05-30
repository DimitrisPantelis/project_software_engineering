public class Participation {
    private int bookingId;
    private int numberOfParticipants;

    public Participation(int bookingId, int numberOfParticipants) {
        this.bookingId = bookingId;
        this.numberOfParticipants = numberOfParticipants;
        System.out.println("Δημιουργήθηκε Participation αντικείμενο.");
    }
}
