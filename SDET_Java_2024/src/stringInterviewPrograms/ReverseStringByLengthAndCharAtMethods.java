package stringInterviewPrograms;

public class ReverseStringByLengthAndCharAtMethods {

	public static void main(String[] args) {

//		Approach 1 - Using length() and charAt() methods
		String s = "Selenium";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i); // Instead of (+), can use concat()

		}
		System.out.println(rev);
	}

}
