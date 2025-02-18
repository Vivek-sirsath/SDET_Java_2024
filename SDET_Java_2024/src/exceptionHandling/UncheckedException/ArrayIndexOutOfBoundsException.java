package exceptionHandling.UncheckedException;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		int[] a = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the position of array where we want to enter value (0-4):");
		// If we enter position > 4, then Exception will come
		int pos = sc.nextInt();

		System.out.println("Enter any value in selected position");
		int value = sc.nextInt(); // java.lang.ArrayIndexOutOfBoundsException

		a[pos] = value;
		
		System.out.println(a[pos]);
		
		System.out.println("Exception not came, program ended");
		
		

	}

}
