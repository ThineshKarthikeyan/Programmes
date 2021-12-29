package com.org.programmes;

public class SumOfOddNumbers {
	
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				count = count + i;
				
			}
		}
		
		System.out.println("The sum of all odd numbers are "+count);
		
		
		
	}

}
