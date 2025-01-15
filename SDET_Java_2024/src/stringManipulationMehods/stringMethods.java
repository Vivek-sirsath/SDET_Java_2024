package stringManipulationMehods;

import java.util.Arrays;

public class stringMethods {

	public static void main(String[] args) {

//		Ways to declare the String :-
		
		// String s = "welcome"; // String literal format , Immutable
		// String s = new String("Hello"); // String as an object
		// System.out.println(s);

//		length() - returns length of string (number of characters)
		String s = "welcome";
		s.length();

		// System.out.println(s.length()); // 7
		System.out.println("welcome".length()); // 7

//		concat() - for joining strings
		String s1 = "Welcome";
		String s2 = "Java";
		String s3 = "Automation";

		// System.out.println(s1+s2); // WelcomeJava
		// System.out.println(s1.concat(s2)); // WelcomeJava
		// System.out.println(s1+s2+s3); // WelcomeJavaAutomation

		// System.out.println(s1.concat(s2).concat(s3)); // WelcomeJavaAutomation

		System.out.println("Welcome" + "Java" + "Automation"); // WelcomeJavaAutomation
		System.out.println("Java".concat("Automation")); // JavaAutomation

//		trim() - remove spaces from right and left side
		s = "   java   ";
		System.out.println(s); // ' java '
		System.out.println(s.trim()); // java
		System.out.println("Length of string before trimming: " + s.length());
		System.out.println("Length of string after trimming: " + s.trim().length());

//		charAt() - returns character from string based on index
		s = "welcome";
		System.out.println(s.charAt(3)); // c
		System.out.println(s.charAt(0)); // w

//		contains() - returns true OR false
//		[CASE SENSITIVE and depends on SEQUENCE OF CHARACTERS]
		System.out.println(s.contains("wel")); // true
		System.out.println(s.contains("Wel")); // false
		System.out.println(s.concat("welme")); // false

//		equals() , equalsIgnoreCase() - compare two strings, returns true/false
		s1 = "welcome";
		s2 = "welcome";

		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals("Welcome")); // false
		System.out.println(s1.equalsIgnoreCase("WelCome")); // true

//		replace() - replace single character OR multiple sequence of characters
		s = "Welcome to selenium java";
		System.out.println(s.replace('e', 'X'));
		// WXlcomX to sXlXnium java

		s = "The man ran to the van";
		System.out.println(s.replace("an", "ZX"));
		// The mZX rZX to the vZX

//		substring() - Extract sub string from the main string
		// starting index - 0 1 2 3 4 5 6
		//                  w e l c o m e
		//   ending index - 1 2 3 4 5 6 7

		s = "welcome";
		System.out.println(s.substring(1, 4)); // elc
		System.out.println(s.substring(3, 7)); // come
		System.out.println(s.substring(4)); // ome

//		toUpperCase() , toLowerCase()
		s = "My name is Vivek";
		System.out.println(s.toUpperCase()); // MY NAME IS VIVEK
		System.out.println(s.toLowerCase()); // my name is vivek

//		split() - split the string into multiple parts based on delimiter
		s = "abc@gmail.com";
		String a[] = s.split("@");
		System.out.println(a[0]); // abc
		System.out.println(a[1]); // gmail.com
		System.out.println(Arrays.toString(a)); // [abc, gmail.com]

		// example 1
		String amount = "$15,20,55";

		System.out.println(amount.replace("$", "")); // 15,20,55
		System.out.println(amount.replace("$", "").replace(",", "")); // 152055
		
		// example 2
		s = "abc,123@xyz"; // abc  123  xyz
		
		String arr1[] = s.split(",");
		System.out.println(Arrays.toString(arr1)); // [abc, 123@xyz]
		System.out.println(arr1[0]); // abc
		System.out.println(arr1[1]); // 123@xyz
		
		String arr2[] = arr1[1].split("@");
		System.out.println(Arrays.toString(arr2)); // [123, xyz]
		
		System.out.println(arr1[0]); // abc
		System.out.println(arr2[0]); // 123
		System.out.println(arr2[1]); // xyz
		
		// example 3
		s = "abc 123";
		String ar[] = s.split(" "); // space can be use as delimiter
		System.out.println(Arrays.toString(ar)); // [abc, 123]
		// NOTE: *  %  ^  &  (  ) - Cannot used as delimiters
		
		// example 4
		 String name = "John Kennedy";
		System.out.println(name.contains("john")); // false
		System.out.println(name.replace('J', 'j').contains("john")); // true
		System.out.println(name.toLowerCase().contains("john")); // true	
		
	}

}
