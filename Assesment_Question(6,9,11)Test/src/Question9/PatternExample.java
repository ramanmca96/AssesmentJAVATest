package Question9;

import java.util.Scanner;

public class PatternExample {

	public static void main(String[] args) {
		int number=5;
		/*
		 * Scanner scan = new Scanner(System.in); int number = scan.nextInt();
		 * System.out.println("Enter The Number :" + number);
		 */
		for (int i = 1; i <= number; i++) {

			for (int j = number; j >= 1; j--) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
}
