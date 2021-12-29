package com.org.programmes;

public class FactorialNumber {
	
	public static void main(String[] args) {

		int a = 4;
		int value = 1;
		for (int i = a; i > 0; i--) {
			value = value * i;
		}
		System.out.println("the factorial of number 4 is " + value);

	}

}
