package exceptionHandling.UncheckedException;

import java.util.Scanner;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int num = sc.nextInt();

		// If we enter zero '0' then ArithmaticException will come
		try {
		System.out.println("Div = " + 100 / num); // java.lang.ArithmeticException
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Exception handled, program ended");

	}

}
