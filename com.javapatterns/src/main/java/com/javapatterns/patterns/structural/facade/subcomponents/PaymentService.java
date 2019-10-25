package com.javapatterns.patterns.structural.facade.subcomponents;

/**
 * 
 * Subsystem service class
 *
 */
public class PaymentService {
	public static boolean makePayment() {
		/*Connect with payment gateway for payment*/
		return true;
	}
}
