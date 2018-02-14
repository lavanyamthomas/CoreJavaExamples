package com.core.java.designPattern.factory;

public class FactoryMain {

	public FactoryMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ShapeFactoryPattern sfp = new ShapeFactoryPattern();
		Shape shape = sfp.getShape("CIRCLE");
		shape.draw();
		
		Shape shape2 = sfp.getShape("RECTANGLE");
		shape2.draw();
	}

}
