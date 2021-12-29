package com.org.programmes;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		System.out.println("Enter the number of times");
		int count = s.nextInt();
		for (int i = 0 ; i < count; i++) {
		int c = a + b;
		System.out.println(c);
		a = b;
		b = c;
		}


	}

}
