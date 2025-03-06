
/*
   The code below is supposed to do the following:

   If an integer is even, then output True.
   If an integer is odd, then output False.
*/

package debugging_CodeChef;

import java.util.Scanner;

public class LogicalError_IncorrectCondition {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n = scanner.nextInt();

		if (n % 2 == 0) {  // Logical error - It should be : n % 2 == 1
			System.out.println("false");
		} else {
			System.out.println("true");
		}

		scanner.close();
	}

}
