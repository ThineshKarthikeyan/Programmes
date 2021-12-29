package com.org.programmes;

public class SentenceReverse {
	
	public static void main(String[] args) {
		String s = "Thinesh Kumaar Karthikeyan";
		String[] sp = s.split(" ");
		String r = " ";

		
		
		for (int i = 0; i < sp.length; i++) {
			String word = sp[i];
			String rev = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				char c = word.charAt(j);
				rev  = rev + c;
				
			}
			r = r + rev + " ";
		}
		
		System.out.println(r);
	}

}
