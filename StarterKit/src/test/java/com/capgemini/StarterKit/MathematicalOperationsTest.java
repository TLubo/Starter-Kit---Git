package com.capgemini.StarterKit;

import org.junit.Assert;
import org.junit.Test;

public class MathematicalOperationsTest {
		
	@Test
	public void testShouldMultiply1And2And3AndGive6 () {
		Assert.assertEquals(6, MathematicalOperations.multiply(1,2,3));
	}

	@Test
	public void testShouldMultiplyMinus1And2And3AndGive6 () {
		Assert.assertEquals(-6, MathematicalOperations.multiply(-1,2,3));
	}

	@Test
	public void testShouldMultiply2WithNothingAndGive2 () {
		Assert.assertEquals(2, MathematicalOperations.multiply(2));
	}

	
}
