
// Example of multiple Inheritance
package oops.Interface1;

public class C1 implements I1, I2 {
	
	public void m1() {
		System.out.println("value of x= " + x);
	}
	
	public void m2() {
		System.out.println("value of y= " + y);
	}

	public static void main(String[] args) {
		
		C1 c1Obj = new C1();
		
		c1Obj.m1(); // 100
		c1Obj.m2(); // 200

	}

}
