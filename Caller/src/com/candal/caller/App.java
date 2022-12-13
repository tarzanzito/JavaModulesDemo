package com.candal.caller;

import com.candal.maths.Calcs;

public class App {

	public static void main(String[] args) {
		
		var addition = new Calcs();
		
		int result = addition.add(10, 20);
		
		System.out.println("Call module result is: " + result);
	}
}
