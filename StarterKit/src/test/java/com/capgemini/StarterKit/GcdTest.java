package com.capgemini.StarterKit;

import org.junit.*;

public class GcdTest {
		
	@Test
	public void whenNumbersAre4And1ThenGcdIs1() {
		Assert.assertEquals(1, Gcd.gcd(4,1));
	}
	
	@Test
	public void whenNumbersAre4And2ThenGcdIs2() {
		Assert.assertEquals(2, Gcd.gcd(4,2));
	}
	
	@Test
	public void whenNumbersAre7And64ThenGcdIs1() {
		Assert.assertEquals(1, Gcd.gcd(7,64));
	}
	
	@Test
	public void whenNumbersAre8And16And4And12ThenGcdIs4() {
		Assert.assertEquals(4, Gcd.gcd(8,16,4,12));
	}
	
	@Test
	public void whenNumbersAre9And12And6ThenGcdIs3() {
		Assert.assertEquals(3, Gcd.gcd(9,12,6));
	}
}
