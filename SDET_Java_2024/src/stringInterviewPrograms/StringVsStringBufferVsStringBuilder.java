package stringInterviewPrograms;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
//		String - Immutable (Can not change)
		
		String s = "Good";
		s.concat("Morning");
		System.out.println(s); // Good // Immutable - original value can't change
		
		// We can concat but we've to create string variable
		String temp = s.concat("Afternoon");
		System.out.println(temp);
		
//		StringBuffer - Mutable (Can change)
		
		StringBuffer sbf = new StringBuffer("Hello");
		sbf.append("Java");
		System.out.println(sbf); // HelloJava // Immutable - original value can't change
		
//		StringBuilder - Mutable (Can change)
		
		StringBuilder sbl = new StringBuilder("Auto");
		sbl.append("mation");
		System.out.println(sbl); // Automation // Immutable - original value can't change
		

	}

}
