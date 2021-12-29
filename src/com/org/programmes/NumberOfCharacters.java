package com.org.programmes;

import java.util.HashMap;

public class NumberOfCharacters {
	
	public static void numberOfCharacters(String word) {
		char[] a = word.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : a) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				
			} else {
				map.put(c, 1);

			}
			
		}
		System.out.println(map);
					
	}
	
	public static void main(String[] args) {
		numberOfCharacters("Thinesh");
			
	}

}
