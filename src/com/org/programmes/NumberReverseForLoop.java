package com.org.programmes;

public class NumberReverseForLoop {
	
	public static void main(String[] args) {
		
		int a = 3684351;
		int b = 0;
		int c = 0;

		System.out.println(a);
		for(int i = a; a > 0; a = a / 10) {
		b = a % 10;
		c = b + (10 * c);
	}
		System.out.println(c);
	}

}
