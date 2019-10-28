package com.javapatterns.patterns.behavioral.chainofresponsibility;

import com.javapatterns.patterns.behavioral.chainofresponsibility.handlers.*;

/**
 * 
 * Client portion of the COR
 *
 */
public class RequestorClient {
	
	public static AbstractSupportHandler getHandlerChain() {
		AbstractSupportHandler technicalSupportHandler = new TechnicalSupportHandler(AbstractSupportHandler.TECHNICAL);
		AbstractSupportHandler billingSupportHandler = new BillingSupportHandler(AbstractSupportHandler.BILLING);
		AbstractSupportHandler generalSupportHandler = new GeneralSupportHandler(AbstractSupportHandler.GENERAL);
		
		technicalSupportHandler.setNextHandler(billingSupportHandler);
		billingSupportHandler.setNextHandler(generalSupportHandler);
		
		return technicalSupportHandler;
	}

}
