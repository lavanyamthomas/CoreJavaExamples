/**
 * 
 */
package com.core.java.designPattern.singleton;

/**
 * @author lavanya
 *
 */
public class SingletonPatternMain {

	/**
	 * 
	 */
	public SingletonPatternMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonPatternObject spo = SingletonPatternObject.getSPO(); 
		
		spo.getMessage();

	}

}
