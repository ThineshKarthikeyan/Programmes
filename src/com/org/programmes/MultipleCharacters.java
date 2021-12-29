package com.org.programmes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MultipleCharacters {
	
	public static void main(String[] args) {
		
		String s = "ThineshKumaarKarthikeyan";
		
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				
				char b = s.charAt(j);
				if (a == b) {
					count  = count + 1;
					
				}
			}
			
				Map<Character, Integer> y = new LinkedHashMap<Character, Integer>();
				y.put(a, count);
				System.out.println(y);
			}
			
		}
		
		
		
		
		
		
		
	}

