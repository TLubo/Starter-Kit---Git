package com.capgemini.StarterKit;

import java.util.Arrays;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class GoogleGuavaLibTest {
	
	public static Predicate<Integer> isEven = new Predicate<Integer>() {
		public boolean apply(Integer arg0) {
			return (arg0%2) == 0;
		}
	};

	public static Predicate<Integer> isOdd = new Predicate<Integer>() {
		public boolean apply(Integer arg0) {
			return (arg0%2) == 1;
		}
	};
	
	private static void printEach(Iterable<Integer> evenNumbers) {
		for (Object object : evenNumbers) {
			System.out.print(object + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Iterable<Integer> evenNumbers = Iterables.filter(numbers, isEven);
		Iterable<Integer> oddNumbers = Iterables.filter(numbers, isOdd);
		printEach(evenNumbers);
		printEach(oddNumbers);
	}

}
