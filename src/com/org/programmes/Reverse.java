package com.org.programmes;

public class Reverse {
	
	public static void main(String[] args) {
		String c = "";
		String a = "Thinesh";
		char[] b = a.toCharArray();
		
		for (int i = 2; i >= 0; i--) {
			System.out.print(b[i]);
		}
		String z = a.substring(3);
		System.out.print(z);
		
	}

}
