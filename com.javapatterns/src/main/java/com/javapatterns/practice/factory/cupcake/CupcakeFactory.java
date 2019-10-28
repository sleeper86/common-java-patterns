package com.javapatterns.practice.factory.cupcake;

public class CupcakeFactory extends CupcakeBaseFactory {

	@Override
	public Cupcake makeCupcake(String type) {
		Cupcake cupcake;
		
		switch(type)
		{
		case "velvet":
				cupcake = new VelvetCupcake();
				break;
		case "chocolate":
				cupcake = new ChocolateCupcake();
				break;
		default: throw new IllegalArgumentException("Bike type does not exist.");
		}
		
		cupcake.addFrosting();
		cupcake.addSprinkles();
		return cupcake;
	}

}
