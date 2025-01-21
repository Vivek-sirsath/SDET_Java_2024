package wrapperClasses;

public class DataConversionMethods {

	public static void main(String[] args) {

// Scenario 1 : String --> int, double, boolean
//		        String ---> char [NOT POSSIBLE]

// 1) String --> int	

//		String s = "welcome"; // Cann't convert to string/
//		int sint = Integer.parseInt(s); // java.lang.NumberFormatException

		String s1 = "10";
		String s2 = "20";
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2)); // 30
//		------------------------------------------------------------------

// 2) String --> double

		String a = "5.2";
		String b = "10.5";
		System.out.println(Double.parseDouble(a) + Double.parseDouble(b)); // 15.7
//		------------------------------------------------------------------

// 3) String --> boolean

		String x = "true";
		System.out.println(Boolean.parseBoolean(x)); //true
		// Other than true, if we pass any string that will return false.
// ================================================================================		
		
// Scenario 2 : int, double, boolean, char --> String		
//		To convert any data type  ---> String
//	    Only one method is to convert all primitive data types into string
//		String.valueOf(); 
		
		int e = 10;
		double d  = 2.5;
		char c = 'A';
		boolean bool = true;
		
		System.out.println(String.valueOf(e)); // 10
		System.out.println(String.valueOf(c)); // A
		System.out.println(String.valueOf(bool)); // true
		
		
	}

}
