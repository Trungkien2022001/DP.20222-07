package subsystem;

import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;
import subsystem.interbank.InterbankCreditCardController;
import subsystem.interbank.InterbankDomesticController;
import subsystem.interbank.PayStrategy;

/***
 * The {@code InterbankSubsystem} class is used to communicate with the
 * Interbank to make transaction.
 * 
 * @author hieud
 *
 */
public class InterbankSubsystem implements InterbankInterface {

	private PayStrategy payStrategy;
	/**
	 * Represent the controller of the subsystem
	 */
	// private InterbankCreditCardController ctrl;

	/**
	 * Initializes a newly created {@code InterbankSubsystem} object so that it
	 * represents an Interbank subsystem.
	 */
	public void setStrategy(PayStrategy payStrategy) {
		this.payStrategy = payStrategy;
	 }

	// public InterbankSubsystem() {
	// 	this.ctrl = new InterbankSubsystemController();
	// }

	/**
	 * @see InterbankInterface#payOrder(CreditCard, int,
	 *      String)
	 */
	public PaymentTransaction payOrder(Card card, int amount, String contents) {
		PaymentTransaction transaction = payStrategy.payOrder(card, amount, contents);
		return transaction;
	}

	/**
	 * @see InterbankInterface#refund(CreditCard, int,
	 *      String)
	 */
	public PaymentTransaction refund(Card card, int amount, String contents) {
		PaymentTransaction transaction = payStrategy.refund(card, amount, contents);
		return transaction;
	}
}
