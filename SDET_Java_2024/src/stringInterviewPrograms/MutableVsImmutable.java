package stringInterviewPrograms;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		// Mutable = Can change value
		// Immutable = Cannot change value
		
//		Mutable: 
		
		int a[] = {20,10,30,50,40};
		System.out.println("Before Sorting: " + Arrays.toString(a)); // [20, 10, 30, 50, 40]	
		Arrays.sort(a);
		System.out.println("After Sorting: " + Arrays.toString(a)); // [10, 20, 30, 40, 50]
		
//		Immutable:
		
		String s = new String("welcome");
		System.out.println("Before Changing: " + s); // welcome
		s.concat("to java");
		System.out.println("Before Changing: " + s); // welcome (NOT CHANGING / IMMUTABLE)
		
//		We can concat but we have to create a new variable
		String concatinated = s.concat(" to java");
		System.out.println(concatinated);
		
	}

}
