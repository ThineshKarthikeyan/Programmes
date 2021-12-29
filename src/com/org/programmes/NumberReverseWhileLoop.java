package com.org.programmes;

public class NumberReverseWhileLoop {
	
	public static void main(String[] args) {
	int a = 583154;
	int b = 0;
	int c = 0;
	int d = a;
	
	while(d > 0) {
		
		b = d % 10;
		c = b + (10 * c);
		d = d /10;
	}
	System.out.println(a);
	System.out.println(c);	
	
	}
}
