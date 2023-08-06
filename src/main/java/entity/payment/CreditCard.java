package entity.payment;

/**
 * @author
 */
public class CreditCard extends Card {

    // private String cardCode;
    // private String owner;
    private String dateExpired;
    protected int cvvCode;

    public CreditCard(String cardNumber, String cardHolderName, String dateExpired, int cvvCode) {
        // this.cardCode = cardCode;
        // this.owner = owner;
        super(cardHolderName, cardNumber);
        this.dateExpired = dateExpired;
        this.cvvCode = cvvCode;
    }
}
