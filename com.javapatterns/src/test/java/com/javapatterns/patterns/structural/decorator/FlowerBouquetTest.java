package com.javapatterns.patterns.structural.decorator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javapatterns.patterns.structural.decorator.components.FlowerBouquet;
import com.javapatterns.patterns.structural.decorator.components.OrchidBouquet;
import com.javapatterns.patterns.structural.decorator.components.RoseBouquet;
import com.javapatterns.patterns.structural.decorator.decorators.Glitter;
import com.javapatterns.patterns.structural.decorator.decorators.PaperWrapper;
import com.javapatterns.patterns.structural.decorator.decorators.RibbonBow;

public class FlowerBouquetTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void testFlowerBouquet() {
		/* Rose with no decoration */
		FlowerBouquet roseBouquet = new RoseBouquet();
		System.out.println(roseBouquet.getDescription() 
				+ " $ " + roseBouquet.cost());
		
        assertEquals(12.0, roseBouquet.cost(), 0);
		
		/*Rose bouquet with paper wrapper, ribbon bow, and glitter*/
        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet=new PaperWrapper(decoratedRoseBouquet);
        decoratedRoseBouquet=new RibbonBow(decoratedRoseBouquet);
        decoratedRoseBouquet=new Glitter(decoratedRoseBouquet);
        System.out.println(decoratedRoseBouquet.getDescription()
                + " $ " + decoratedRoseBouquet.cost());
        
        assertEquals(25.5, decoratedRoseBouquet.cost(), 0);
        
         /*Orchid bouquet with double paper wrapper and ribbon bow*/
        FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
        decoratedOrchidBouquet=new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet=new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet=new RibbonBow(decoratedOrchidBouquet);
        System.out.println(decoratedOrchidBouquet.getDescription()
                + " $ " + decoratedOrchidBouquet.cost());
        
        assertEquals(41.5, decoratedOrchidBouquet.cost(), 0);
	}

}
