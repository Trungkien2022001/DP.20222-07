public class PayPalPaymentStrategy implements PaymentStrategy {
    private String paypalUsername;
    private String paypalPassword;

    public PayPalPaymentStrategy(String paypalUsername, String paypalPassword) {
        this.paypalUsername = paypalUsername;
        this.paypalPassword = paypalPassword;
    }

    @Override
    public void performPayment() {
        // Thực hiện thanh toán bằng PayPal
        // ...
    }
}
