package com.org.programmes;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String s = "Thinesh";
		String a = null;
		for (int i = s.length() - 1; i >= 0; i++) {
			char c = s.charAt(i);
			a = a + c;
		}
		System.out.println(a);
	}

}
