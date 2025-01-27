package stringInterviewPrograms;

public class ReverseStringByConvertingIntoCharArray {

	public static void main(String[] args) {

		String s = "welcome";
		String rev = "";

		char a[] = s.toCharArray(); // Converts this string to a character array.

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + a[i]; // instead of (+), concat() method can be used
		}
		System.out.println(rev);
	}

}
