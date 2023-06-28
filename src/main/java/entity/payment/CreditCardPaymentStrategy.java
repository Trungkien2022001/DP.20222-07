public class CreditCardPaymentStrategy implements PaymentStrategy {
    private CreditCard creditCard;

    public CreditCardPaymentStrategy(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void performPayment() {
        // Thực hiện thanh toán bằng thẻ tín dụng
        // ...
    }
}
