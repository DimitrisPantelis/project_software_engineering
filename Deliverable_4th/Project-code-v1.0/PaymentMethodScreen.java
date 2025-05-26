public class PaymentMethodScreen extends ManagePaymentClass {

    public PaymentMethodScreen() {
        super(); // Κλήση constructor της ManagePaymentClass
    }

    public void display() {
        System.out.println("Επιλέξτε μέθοδο πληρωμής:");
        System.out.println("- Πιστωτική Κάρτα");
        System.out.println("- Μετρητά");
        System.out.println("- PayPal");
        System.out.println("- Τραπεζική Κατάθεση");
    }

    public void showResults() {
        System.out.println("Επιλεγμένη μέθοδος πληρωμής: " + getMethod());
    }
}
