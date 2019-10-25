package com.javapatterns.patterns.structural.facade.servicefacade;

import com.javapatterns.patterns.structural.facade.domain.Product;
import com.javapatterns.patterns.structural.facade.subcomponents.InventoryService;
import com.javapatterns.patterns.structural.facade.subcomponents.PaymentService;
import com.javapatterns.patterns.structural.facade.subcomponents.ShippingService;

/**
 * 
 * Concrete implementation of the abstract service facade
 *
 */
public class OrderServiceFacadeImpl implements OrderServiceFacade {

	@Override
	public boolean placeOrder(int pId) {
		boolean orderFulfilled = false;
		Product product = new Product();
		product.productId = pId;
		
		if(InventoryService.isAvailable(product))
		{
			System.out.println("Product with ID: " + product.productId + " is avaialble.");
			boolean paymentConfirmed = PaymentService.makePayment();
			
			if(paymentConfirmed) {
                System.out.println("Payment confirmed...");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped...");
                orderFulfilled=true;
			}
		}
		
		return orderFulfilled;
	}

}
