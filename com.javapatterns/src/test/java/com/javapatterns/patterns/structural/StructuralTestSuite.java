package com.javapatterns.patterns.structural;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.javapatterns.patterns.structural.adapter.NewLineFormatterTest;
import com.javapatterns.patterns.structural.bridge.MessageTest;
import com.javapatterns.patterns.structural.composite.CatalogComponentTest;
import com.javapatterns.patterns.structural.decorator.FlowerBouquetTest;
import com.javapatterns.patterns.structural.facade.OrderFulfillmentControllerTest;
import com.javapatterns.patterns.structural.flyweight.RaceCarClientTest;
import com.javapatterns.patterns.structural.proxy.ReportGeneratorImplProxyTest;

@RunWith(Suite.class)				
@Suite.SuiteClasses({		
	NewLineFormatterTest.class,
	MessageTest.class,
	CatalogComponentTest.class,
	FlowerBouquetTest.class,
	OrderFulfillmentControllerTest.class,
	RaceCarClientTest.class,
	ReportGeneratorImplProxyTest.class,
})

public class StructuralTestSuite {

}
