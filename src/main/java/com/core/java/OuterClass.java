/**
 * 
 */
package com.core.java;

/**
 * @author lavanya
 *
 */
 class OuterClass {
	 
	 
	 class testInnerClass {
		 
		 void message() {
		
		 System.out.println("sdddfsdfds");
		 }
	 }
	 
	public static void main(String a[]) {
		
		OuterClass oc = new OuterClass();
		
		OuterClass.testInnerClass tn  = oc.new testInnerClass();
		tn.message();
		
	}
	
}

 
