public class Card {
    private String number;
    private String cvv;

    public Card(String number, String cvv) {
        this.number = number;
        this.cvv = cvv;
    }

    public String getNumber() {
        return number;
    }

    public String getCvv() {
        return cvv;
    }
}
