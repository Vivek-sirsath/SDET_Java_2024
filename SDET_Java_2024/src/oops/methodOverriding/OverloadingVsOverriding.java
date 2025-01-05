/*
 * 1) Here we can see Overloading with inheritance. 
 * 2) Using inheritance we can achieve both Overriding and overloading.
 * 3) Overriding we can achieve with inheritance only.
 * 4) Overloading we can achieve with or without inheritance.
 *    In a single class we can achieve overloading. But, we cann't
 *    achieve overriding in single class because it requires inheritance.
 *  5)  
 *    
 * 
 * 
 * */

package oops.methodOverriding;

class ABC {

	void m1(int a) {
		System.out.println(a);
	}

	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC {
	void m1(int a) { // Overriding
		System.out.println(a*a);
	}
	
	void m2(int b) {
		System.out.println(b*b);
	}
	
	void m2(int a, int b) { // Overloading with inheritance
		System.out.println(a+b);
	}
}

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		
		XYZ xyzObj = new XYZ();
		xyzObj.m1(10); // 100
		xyzObj.m2(20); // 20
		xyzObj.m2(10, 20); // 30

	}

}
