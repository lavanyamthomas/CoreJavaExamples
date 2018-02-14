package com.core.java.designPattern.abstractFactory;

public class ShapeFactoryPattern extends AbstractFactory{

	public ShapeFactoryPattern() {
		// TODO Auto-generated constructor stub
	}
	
	public Shape getShape(String shape){
		
		if(shape.equals("CIRCLE")) {
			
			return new Circle();
		}else if(shape.equals("RECTANGLE")) {
			
			return new Rectangle();
		}
		return null;
		
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
