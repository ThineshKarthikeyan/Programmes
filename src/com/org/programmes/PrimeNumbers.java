package com.org.programmes;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		
		
		for (int i = 2; i < 50; i++) {
			int count = 0;
			
			for (int k = 1; k < i/2; k++) {
				if (i % k == 0) {
					count = 1;
				}
			}
			if (count == 0) {
				System.out.println(i);
				
			}
			
		}
		
		
		
		
	}

}
