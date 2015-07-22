
package com.capgemini.StarterKit;

public class MathematicalOperations {

	public static long multiply(long... number) {
		long result = 1;
		for (long l : number)
			result *= l;
		return result;
	}

	public static double adding(double number1, double number2) {
		return number1 + number2;
	}

}
