package com.javapatterns.patterns.structural.facade;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javapatterns.patterns.structural.facade.controller.OrderFulfillmentController;
import com.javapatterns.patterns.structural.facade.servicefacade.OrderServiceFacadeImpl;

public class OrderFulfillmentControllerTest {
	
	@Test
	public void testOrderProduct() throws Exception {
		OrderFulfillmentController controller = new OrderFulfillmentController();
		controller.setFacade(new OrderServiceFacadeImpl());
		
		controller.orderProduct(1910251111);
		
		boolean result = controller.isOrderFulfilled();
		
		assertEquals(true, result);
	}

}
