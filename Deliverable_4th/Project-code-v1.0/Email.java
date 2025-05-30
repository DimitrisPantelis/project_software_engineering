public class Email {
    private int bookingId;
    private String bookingDate;
    private String bookingTime;

    public Email(int bookingId, String bookingDate, String bookingTime) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.bookingTime = bookingTime;
    }

    public void send() {
        System.out.println("Αποστολή email για κράτηση " + bookingId);
    }
}
