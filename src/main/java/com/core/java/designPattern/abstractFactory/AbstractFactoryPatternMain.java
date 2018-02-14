/**
 * 
 */
package com.core.java.designPattern.abstractFactory;

/**
 * @author lavanya
 *
 */
public class AbstractFactoryPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		AbstractFactory af = FactoryProducer.getAbstractFactory("SHAPE");
		Shape shape = af.getShape("CIRCLE");
		shape.draw();
		
		
		AbstractFactory af1 = FactoryProducer.getAbstractFactory("COLOR");
		Color color = af1.getColor("RED");
		color.fill();
	}

}
