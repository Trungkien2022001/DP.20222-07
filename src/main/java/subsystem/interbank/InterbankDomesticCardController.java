package subsystem.interbank;

import entity.payment.DomesticCard;
import entity.payment.PaymentTransaction;

public class InterbankDomesticCardController implements PayStrategy{

	private static InterbankDomesticCardConverter interbankDomesticCardConverter = new InterbankDomesticCardConverter();
	private static InterbankBoundary interbankBoundary = new InterbankBoundary();

    	public PaymentTransaction refund(Card card, int amount, String contents) {
		return null;
	}

	public PaymentTransaction payOrder(Card card, int amount, String contents) {
		String requestPayload = interbankDomesticCardConverter.convertToRequestPayload(card, amount, contents);
		String responseText = interbankBoundary.query(InterbankConfigs.PROCESS_TRANSACTION_URL, requestPayload);
		return interbankDomesticCardConverter.extractPaymentTransaction(responseText);
	}
}
