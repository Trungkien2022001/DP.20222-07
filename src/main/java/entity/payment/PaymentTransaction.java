public class PaymentTransaction {
    private String errorCode;
    private PaymentStrategy paymentStrategy;
    private String transactionId;
    private String transactionContent;
    private int amount;
    private String createdAt;

    public PaymentTransaction(String errorCode, PaymentStrategy paymentStrategy, String transactionId,
                              String transactionContent, int amount, String createdAt) {
        this.errorCode = errorCode;
        this.paymentStrategy = paymentStrategy;
        this.transactionId = transactionId;
        this.transactionContent = transactionContent;
        this.amount = amount;
        this.createdAt = createdAt;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void performPayment() {
        paymentStrategy.performPayment();
    }
