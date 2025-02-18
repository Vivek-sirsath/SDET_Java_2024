package exceptionHandling.UncheckedException;

public class NullPointerException {

	public static void main(String[] args) {
		
		String s = "Welcome";
		System.out.println(s.length()); // 7
		
		String s1 = "";
		System.out.println(s1.length()); // 0
		
		// If we assign null value to the variable, will throw NullPointerException
		
//		String s2 = null;
//		System.out.println(s2.length()); // NullPointerException
		
//		Integer x = null;
//		System.out.println(x == 1); // NullPointerException
		
		int[] arr = null;
		System.out.println(arr.length); // NullPointerException

	}

}
