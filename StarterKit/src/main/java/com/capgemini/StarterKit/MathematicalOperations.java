package com.capgemini.StarterKit;

public class MathematicalOperations {
	
	public static long multiply(long ... number) {
		long result = 1;
		for (long l : number)
			result *= l;
		return result;
	}
	
}
