package subsystem.interbank;

import common.exception.PaymentException;
import common.exception.UnrecognizedException;
import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;


public interface PayStrategy {
    public abstract PaymentTransaction payOrder(Card card, int amount, String contents);
		

	public abstract PaymentTransaction refund(Card card, int amount, String contents);
}
