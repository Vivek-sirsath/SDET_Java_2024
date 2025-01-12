
// Example of multiple Inheritance
// We can extends a class as well as implements multiple interfaces as a combination
package oops.Interface2;

public class C2 extends C3 implements I3, I4 {

	public void m1() {
		System.out.println("value of x= " + x);
	}

	public void m2() {
		System.out.println("value of y= " + y);
	}

	public static void main(String[] args) {

		C2 c2Obj = new C2();

		c2Obj.m1(); // 100
		c2Obj.m2(); // 200

		c2Obj.m3(); // 300

	}

}
