package stringInterviewPrograms;

public class StringComparison {

	public static void main(String[] args) {

//		Case 1

		// In this scenario the in both cases by (==) and by equals() method
		// will return true
		String s1 = "welcome";
		String s2 = "welcome";

		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true

//		Case 2
		String st1 = new String("hollywood");
		String st2 = new String("hollywood");
		System.out.println(st1);
		System.out.println(st2);
		
		/*
		 * (==) is used to compare the objects
		 * equals() - method is used to vompare the values objects
		 * "hollywood" are values of objects
		 * */
		System.out.println(st1 == st2); // false because 2 different objects
		System.out.println(st1.equals(st2)); // true
		
//		Case 3
		String s = "abc";
		String str = new String("abc");
		
		System.out.println(s == str); // false
		System.out.println(s.equals(str)); // true
		
//		Case 4
		String str1 = "xyz";
		String str2 = new String("xyz");
		String str3 = str2;
		
		// str2 is a object created by using new keyword 
        // str2 and str3 both pointing towards the same object
				
		System.out.println(str1 == str2); // false
		System.out.println(str1.equals(str2)); // true // Values are equal
		
		System.out.println(str2 == str3); // true // Both objects are same/equal
		System.out.println(str2.equals(str3)); // true 
		
		System.out.println(str1 == str3); // false // Totally different objects
		System.out.println(str1.equals(str3)); // true
		
/*		Assignments:-
 *      
 *      1) Check the string "MADAM" is palindrome or not
 *      2) Remove Junk or Special characters in String
 *      3) How will you remove white spaces in a string
 *      4) Count occurrences of a character in a string 		
*/
		
	}

}
