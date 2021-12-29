package com.org.programmes;

public class FirstLetterUpperCase {
	
	public static void main(String[] args) {
		
		String s = "Thinesh Kumaar Karthikeyan";
		String[] sp = s.split(" ");
		String e = "";
		for (int i = 0; i < sp.length; i++) {
			String a = sp[i];
			String b = a.substring(0, 1);
			String c = b.toLowerCase();
			String d = a.substring(1);
			e = e + c + d + " ";
					
		}
		System.out.println(e);
	}

}
