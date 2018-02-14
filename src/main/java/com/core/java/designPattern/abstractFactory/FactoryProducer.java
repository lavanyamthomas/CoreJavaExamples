package com.core.java.designPattern.abstractFactory;

public class FactoryProducer {

	static AbstractFactory getAbstractFactory(String choice) {
		if(choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactoryPattern();
		}else if(choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactoryPattern();
		}
		return null;
	}
}
