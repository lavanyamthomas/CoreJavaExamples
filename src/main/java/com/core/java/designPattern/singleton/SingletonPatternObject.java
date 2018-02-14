package com.core.java.designPattern.singleton;

public class SingletonPatternObject {

	private SingletonPatternObject() {
		// TODO Auto-generated constructor stub
	}
	
	
	private static  SingletonPatternObject spo = new SingletonPatternObject();
	
	static SingletonPatternObject getSPO() {
		return spo;
	}
	
	void getMessage() {
		System.out.println("Hello .. This is lavanya");
	}

}
