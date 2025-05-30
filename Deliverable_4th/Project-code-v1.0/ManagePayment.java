import java.util.List;

import javax.smartcardio.Card;

public class ManagePayment {
    private String cardDetails;
    private boolean isCash;
    private String savedCard;

    private DataBaseManager db = new DataBaseManager();

    public void setCard(String cardDetails) {
        this.cardDetails = cardDetails;
        this.isCash = false;
    }

    public void setCash() {
        this.isCash = true;
    }

    public void confirmPayment() {
        System.out.println("Πληρωμή " + (isCash ? "με μετρητά" : "με κάρτα: " + cardDetails));
    }

    public void setSavedCards(String savedCard) {
        this.savedCard = savedCard;
    }

    public void SuccessfulPaymentScreen() {
        System.out.println("Η πληρωμή ολοκληρώθηκε επιτυχώς.");
    }

    public List<Card> getCardDetails(int userId) {
        return db.queryCardDetails(userId);
    }

    public boolean checkCardDetails(Card card) {
        // Βασικός έλεγχος εγκυρότητας
        return card.getNumber().length() == 16 && card.getCvv().length() == 3;
    }

    public boolean changePaymentStatus(int bookingId, String status) {
        return db.updatePaymentStatus(bookingId, status);
    }

    public boolean checkEmail(String email) {
        return email != null && email.contains("@");
    }

    public void InvalidCardDetailsScreen() {
        System.out.println("Invalid card details. Please recheck.");
    }
}
