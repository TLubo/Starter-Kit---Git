package com.capgemini.StarterKit;

public class MathematicalOperations {
	
	public static long power(long number, int powerRate) {
		int result = 1;
		for (int i = 0; i <= powerRate; i++)
			result *= number;
		return result;
	}
	
}
