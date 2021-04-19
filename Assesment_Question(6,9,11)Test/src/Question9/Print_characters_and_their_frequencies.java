package Question9;

import java.util.LinkedHashMap;


public class Print_characters_and_their_frequencies {

	public static void main(String[] args) {
		String str = "Vee Technologies";
		int n = str.length();
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		// For every character of the input string
		for (int i = 0; i < n; i++) {

			// Using java 8 getorDefault method
			char c = str.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// Iterate using java 8 forEach method
		map.forEach((k, v) -> System.out.print(k + "= " + v));
	}
		
	}

