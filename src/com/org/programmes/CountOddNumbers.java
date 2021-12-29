package com.org.programmes;

public class CountOddNumbers {
	
	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 1) {
				count = count + 1;
			}
			
		}
		
		System.out.println("The number of odd numbers between 1 and 100 is " + count);
		
		
		
	}

}
