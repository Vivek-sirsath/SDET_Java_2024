package polymorphism_Static_MethodOverloading;

public class MethodOverload6 {

	public static void main(String[] args) {
		
		System.out.println(MethodOverload5.add(10, 5)); // 15
		System.out.println(MethodOverload5.add(10.5, 5.5));  // 16.0
		System.out.println(MethodOverload3.add(20, 10, 10));  // 40
		/* Here we can call 'MethodOverload3' class methods because it is static
		   we can call static methods from one class to another class by the help of that class name.
		   But those classes should be in same package.  
		*/
		
		MethodOveerload1 mo1 = new MethodOveerload1();
		mo1.sum(10, 5, 20);  // -5
	}

}
