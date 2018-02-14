package com.core.java.designPattern.abstractFactory;

public class ColorFactoryPattern extends AbstractFactory{

	public ColorFactoryPattern() {
		// TODO Auto-generated constructor stub
	}
	
	public Color getColor(String color) {
		
		if(color.equalsIgnoreCase("RED")) {
			return new Red();
		}else if(color.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
