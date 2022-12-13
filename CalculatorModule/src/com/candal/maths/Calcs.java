//
// This package is expose for outside jars
//
package com.candal.maths; //REF'2

public class Calcs {

	public int add(int i, int j) {
		
		int result = i + j;
		System.out.println("Calcs:Add result is: " + result);
		
		return result;
	}
	
	public int sutract(int i, int j) {
		
		int result = i - j;
		System.out.println("Calcs:Subtract result is: " + result);
		
		return result;
	}

}
