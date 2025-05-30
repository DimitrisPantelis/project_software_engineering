public class PaymentMethodScreen {
    private ManagePayment manager = new ManagePayment();

    public void chooseCardPayment(String cardDetails) {
        manager.setCard(cardDetails);
        manager.confirmPayment();
        manager.SuccessfulPaymentScreen();
    }

    public void chooseCashPayment() {
        manager.setCash();
        manager.CashPaymentScreen();
    }

    public void chooseSavedCards(String savedCard) {
        manager.setSavedCards(savedCard);

    }
}
