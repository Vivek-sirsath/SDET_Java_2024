package polymorphism_Static_MethodOverloading;

public class MethodOverload3 {

	/* If we declare the method as static, we can call static method 
	   by the help of that class name itself (MethodOverload4). 
	   Or by the help of (extended class / parent class name) also (MethodOverload3)
	   There will be no need to create of object of class.
	*/
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

}
