package exceptionHandling.UncheckedException;

import java.util.Scanner;

public class ArithmeticException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		// If we enter zero '0' then ArithmaticException will come
		System.out.println("Div = " + 100/num); // java.lang.ArithmeticException
		
		System.out.println("Exception not came, program ended");

	}

}
