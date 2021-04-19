package Question9;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {

		int factorial = 1;
		int number=5;
		/*
		 * Scanner scan = new Scanner(System.in); int number = scan.nextInt();
		 */
		System.out.println("Enter The Number " +number);
		for (int j = 1; j <=number; j++) {
			factorial = factorial * j;
		}
		System.out.println("Given number"+ number + "Factorial Is:" + factorial);
	}
}
