package subsystem.interbank;

import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;

public class InterbankCreditCardController implements PayStrategy {

	private static InterbankCreditCardConverter interbankCreditCardConverter = new InterbankCreditCardConverter();
	private static InterbankBoundary interbankBoundary = new InterbankBoundary();

	public PaymentTransaction refund(Card card, int amount, String contents) {
		return null;
	}

	public PaymentTransaction payOrder(Card card, int amount, String contents) {
		String requestPayload = interbankCreditCardConverter.convertToRequestPayload(card, amount, contents);
		String responseText = interbankBoundary.query(InterbankConfigs.PROCESS_TRANSACTION_URL, requestPayload);
		return interbankCreditCardConverter.extractPaymentTransaction(responseText);
	}


}
