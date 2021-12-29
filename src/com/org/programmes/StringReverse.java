package com.org.programmes;

public class StringReverse {
	
	public static void main(String[] args) {
		String b = "Thinesh";
		StringBuffer a = new StringBuffer(b);
		a.reverse();
		System.out.println(b);
		System.out.println(a);
		
		if (a.equals(b)) {
			System.out.println("It is a palindrome");			
		}
		else
			System.out.println("It isn't a palindrome");		
	}

}
