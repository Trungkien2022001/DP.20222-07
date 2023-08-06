package entity.payment;

public class DomesticCard extends Card {
    private String type;
    private String issuingBank;
    // private String cardHolderName;
    private String validFromDate;
    // protected int cardNumber;

    public DomesticCard(String type, String issuingBank, String cardHolderName, String validFromDate, String cardNumber) {
        super(cardHolderName, cardNumber);
        this.type = type;
        this.issuingBank = issuingBank;
        this.validFromDate = validFromDate;
        // this.cardNumber = cardNumber;
        // this.cardHolderName = cardHolderName;
    }
}
