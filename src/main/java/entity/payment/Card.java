package entity.payment;

public abstract class Card {
    private String cardHolderName;
    private String cardNumber;

    public Card(String cardHolderName, String cardNumber) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }
}
