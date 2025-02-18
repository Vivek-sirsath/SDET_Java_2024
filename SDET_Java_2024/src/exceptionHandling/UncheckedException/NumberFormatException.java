package exceptionHandling.UncheckedException;

public class NumberFormatException {

	public static void main(String[] args) {
		
		String s1 = "12345";
		
		// Convert String to Integer Format
		int num = Integer.parseInt(s1);
		System.out.println(num);
		System.out.println("Successfully converted String s1 into integer.");
		
		// If we try to convert 'Welcome' to integer, it can't possible
		// Because we can't convert alphabets to integer.
		String s2 = "Welcome";
		int num2 = Integer.parseInt(s2); // NumberFormatException
		System.out.println(num2);
		System.out.println("Exception not came, program ended");
	}

}
