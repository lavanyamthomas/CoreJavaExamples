package com.core.java.designPattern.abstractFactory;

public abstract class AbstractFactory {

	public AbstractFactory() {
		// TODO Auto-generated constructor stub
	}

	abstract public Shape getShape(String shape) ;

	abstract public Color getColor(String color) ;

}
