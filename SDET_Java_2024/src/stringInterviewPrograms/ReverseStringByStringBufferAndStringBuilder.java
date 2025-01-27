package stringInterviewPrograms;

public class ReverseStringByStringBufferAndStringBuilder {

	public static void main(String[] args) {
		
//		[Note: reverse() method is not present in the String class
//		it is only available in StringBuffer and StringBuilder classes]
		
//		Approach 1 : Using StringBuffer Class
		
		// String s = "Good Morning";		
		// StringBuffer sbf = new StringBuffer(s);
		
		StringBuffer sbf = new StringBuffer("Good Morning");
		System.out.println("Before Reversing : " + sbf);
		System.out.println("After  Reversing : " + sbf.reverse());
		
//		Approach 2 : Using StringBuilder Class
		
		StringBuilder sbl = new StringBuilder("Good Evening");
		System.out.println("Before Reversing : " + sbl);
		System.out.println("After  Reversing : " + sbl.reverse());
	}

}
