package com.javapatterns.patterns.structural.facade.controller;

import com.javapatterns.patterns.structural.facade.servicefacade.OrderServiceFacade;

/**
 * 
 * Controller class - facade client
 *
 */
public class OrderFulfillmentController {
	OrderServiceFacade facade;
	private boolean orderFulfilled = false;
	
	public void orderProduct(int pId) {
		setOrderFulfilled(facade.placeOrder(pId));
		System.out.println("Order fulfillment completed.");
	}

	/**
	 * @return the facade
	 */
	public OrderServiceFacade getFacade() {
		return facade;
	}

	/**
	 * @param facade the facade to set
	 */
	public void setFacade(OrderServiceFacade facade) {
		this.facade = facade;
	}

	/**
	 * @return the orderFulfilled
	 */
	public boolean isOrderFulfilled() {
		return orderFulfilled;
	}

	/**
	 * @param orderFulfilled the orderFulfilled to set
	 */
	public void setOrderFulfilled(boolean orderFulfilled) {
		this.orderFulfilled = orderFulfilled;
	}
	
	
}
