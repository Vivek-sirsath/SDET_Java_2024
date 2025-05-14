package polymorphism_Static_MethodOverloading;

public class MethodOverload7 {

	public void sum(int a, long b) {
		System.out.println(a + b);
	}

	public void sum(long a, int b) {
		System.out.println(a + b);
	}

	
	  public static void main(String[] args) { 
	  MethodOverload7 mo7 = new  MethodOverload7();
//	  mo7.sum(10, 5); 
}
	 /* 
	  * [NOTE: Try remove '//'  from above, So we can see ambiguity error
	  * generated at Compile-time
	  * "The method sum(int, long) is ambiguous for the type MethodOverload7"]
	  * 
	 * Ambiguity Issue -
	 * "The method sum(int,long) is ambiguous for the type MethodOverload7"
	 * This issue can be resolve by changing data types in methods sum(int, int).
	 * This is shown in class 'MethodOverload8'
	 */

}
