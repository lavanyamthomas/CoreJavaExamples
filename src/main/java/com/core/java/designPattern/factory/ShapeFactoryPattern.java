package com.core.java.designPattern.factory;

public class ShapeFactoryPattern {

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

}
