package com.javapatterns.patterns.structural.facade.subcomponents;

import com.javapatterns.patterns.structural.facade.domain.Product;

/**
 * 
 * Subsystem service class
 *
 */
public class InventoryService {
	public static boolean isAvailable(Product product) {
		/*Check warehouse database for product availability*/
		return true;
	}
}
