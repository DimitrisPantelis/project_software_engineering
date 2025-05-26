public class ManagePaymentClass {
    
    private String paymentMethod;

    public ManagePaymentClass() {
        this.paymentMethod = "unassigned"; // default τιμή
    }

    public void setMethod(String method) {
        if (method == null || method.isBlank()) {
            System.out.println("Invalid payment method.");
        } else {
            this.paymentMethod = method;
            System.out.println("Payment method set: " + method);
        }
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void displayMethod() {
        System.out.println("Current payment method: " + paymentMethod);
    }

    public String setCardDetails (String number, String holderName, String expiryDate){
        if (number == null || number.isBlank() || holderName == null || holderName.isBlank() 
            || expiryDate == null || expiryDate.isBlank()) {
            return "Invalid card details.";
        }
        this.cardNumber = number;
        this.cardHolderName = holderName;
        this.cardExpiryDate = expiryDate;
        return "Card details set successfully.";
    }

    public void getCard(){
        if (cardNumber == null) {
            System.out.println("No card details available.");
            return;
        }
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Expiry Date: " + cardExpiryDate);
    }

    public void setEmail(){
         if (email == null || email.isBlank() || !email.contains("@")) {
            System.out.println("Invalid email.");
        } else {
            this.email = email;
            System.out.println("Email set: " + email);
        }
    }

    public void getEmail() {
        if (email == null) {
            System.out.println("No email set.");
        } else {
            System.out.println("Email: " + email);
        }
    }

}

