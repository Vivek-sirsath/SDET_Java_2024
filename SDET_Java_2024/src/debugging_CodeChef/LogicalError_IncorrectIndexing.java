package debugging_CodeChef;

import java.util.Scanner;

public class LogicalError_IncorrectIndexing {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of string:");
		int n = scanner.nextInt(); // Input length of the string
		
		System.out.println("Enter the string whose length equal to specified length:");
		String s = scanner.next(); // Input string
		
		System.out.println(s.charAt(n - 1)); // Correct indexing for last character
		System.out.println(s.charAt(n)); // Incorrect indexing - Will throw error
		
		scanner.close();

	}

}
