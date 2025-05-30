import model.PaymentStatus;

public class ManagePayment {

    // Attributes
    private int id;
    private int userId;
    private int bookingId;
    private double prize;
    private PaymentStatus status;
    private String dateAndTime;

    private String paymentMethod;
    private String cardDetails;
    private String email;

    // Constructor
    public ManagePayment(int id, int userId, int bookingId, double prize, String dateAndTime) {
        this.id = id;
        this.userId = userId;
        this.bookingId = bookingId;
        this.prize = prize;
        this.dateAndTime = dateAndTime;
        this.status = PaymentStatus.PENDING; // default status
    }

    // Setters
    public void setMethod(String method) {
        this.paymentMethod = method;
    }

    public void setCardDetails(String cardDetails) {
        this.cardDetails = cardDetails;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    // Getters
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getCardDetails() {
        return cardDetails;
    }

    public String getEmail() {
        return email;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public double getPrize() {
        return prize;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    // Example utility method
    public void printPaymentInfo() {
        System.out.println("Payment Info:");
        System.out.println("- User ID: " + userId);
        System.out.println("- Booking ID: " + bookingId);
        System.out.println("- Prize: " + prize);
        System.out.println("- Status: " + status);
        System.out.println("- Method: " + paymentMethod);
        System.out.println("- Email: " + email);
    }
}
