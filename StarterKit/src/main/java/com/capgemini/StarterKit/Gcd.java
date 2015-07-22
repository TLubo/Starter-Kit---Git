package com.capgemini.StarterKit;

import com.google.common.math.IntMath;

public class Gcd {
		
	public static int gcd(int... numbers) {
		
		int greatest = IntMath.gcd(numbers[0], numbers[1]);
		for(int number : numbers) {
			greatest = IntMath.gcd(greatest, number);
		}
		return greatest;
	}

}
