package com.org.programmes;

import java.util.Scanner;

public class OddOrEven {
	
	static int a;
	
	public static void main(String[] args) {
		
		do {
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		}
		while (a <= 0 );
		
		if (a % 2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}

}
