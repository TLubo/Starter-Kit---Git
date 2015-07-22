
package com.capgemini.StarterKit;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MathematicalOperationsTest {

	@Test
	public void testShouldMultiply1And2And3AndGive6() {
		Assert.assertEquals(6, MathematicalOperations.multiply(1, 2, 3));
	}

	@Test
	public void testShouldMultiplyMinus1And2And3AndGive6() {
		Assert.assertEquals(-6, MathematicalOperations.multiply(-1, 2, 3));
	}

	@Test
	public void testShouldMultiply2WithNothingAndGive2() {
		Assert.assertEquals(2, MathematicalOperations.multiply(2));
	}

	@Test
	public void testAddingWhen0Added0Equals0() {

		assertEquals(0.0, MathematicalOperations.adding(0, 0), 0);
	}

	@Test
	public void testAddingWhen20Added30Equals50() {

		Assert.assertEquals(50, MathematicalOperations.adding(20, 30), 0);
	}

	@Test
	public void testShouldFactorialWhen5Then120(){
		Assert.assertEquals(120, MathematicalOperations.factorial(5));
	}
	
	@Test
	public void testShouldFactorialWhen0Then1(){
		Assert.assertEquals(1, MathematicalOperations.factorial(0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testShouldFactorialWhenParameterNegativeThenIllegalArgumentException(){
		MathematicalOperations.factorial(-1);
	}

}
