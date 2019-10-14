package com.javapatterns.patterns.structural.composite;

import java.util.ArrayList;

/**
 * 
 * Represents a composite or node within the tree. Nodes contain child objects unlike leaves.
 * This class stores leaf components and implements behaviors in component to access/manage
 * child components.
 *
 */
public class ProductCatalog extends CatalogComponent {
	private ArrayList<CatalogComponent> items = new ArrayList<>();
	private String name;
	
	public ProductCatalog(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void print() {
		for(CatalogComponent comp : items) {
			comp.print();
		}
	}
	
	@Override
	public void add(CatalogComponent catalogComponent) {
		items.add(catalogComponent);
	}
	
	@Override
	public void remove(CatalogComponent catalogComponent) {
		items.remove(catalogComponent);
	}
}
