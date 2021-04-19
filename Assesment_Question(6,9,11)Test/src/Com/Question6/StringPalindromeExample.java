package Com.Question6;

import java.util.Scanner;

public class StringPalindromeExample {

	public static void main(String args[]) {
		// get input From User Using Scanner
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string Value");
		String Value = in.nextLine();
		// After Get Value From User LowerCase all Value
		String lowerCase = Value.toLowerCase();
		// get the length of value
		int length = lowerCase.length();
		String reverse = "";
		// Iterate It
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + lowerCase.charAt(i);
		if (lowerCase.equals(reverse))
			System.out.println("Entered string is a palindrome.");
		else
			System.out.println("Entered string Not a palindrome.");
	}
}
