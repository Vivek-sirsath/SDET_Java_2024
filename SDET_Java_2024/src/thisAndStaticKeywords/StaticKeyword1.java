// Session 13

package thisAndStaticKeywords;

public class StaticKeyword1 {

	static int a = 10; // static Variable (Italic)
	int b = 50; // non-static variable

	static void m1() {
		System.out.println("This is static m1 method");
	}

	void m2() { 
		System.out.println("This is non-static m2 method");
	}

	void m3() { // Non-static method can access everything
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		
/*		[NOTE: In the main method of same class we can access. But, if the main method is in 
 *             another class then we have to use class name as reference
 *             No object required.
 *             e.g.
 *                   System.out.println(StaticKeyword1.a);
		             StaticKeyword1.m1();
 *             ]
*/		
//		1) Static methods can access static stuff directly (without object)
		System.out.println(a);
		m1();
		
//		System.out.println(b); // Cannot access, b is non-static.
//		m2(); // Cannot access, m2() is non-static.
		
//		2) Static methods can access non-static stuff throgh objects.
		StaticKeyword1 stk = new StaticKeyword1();
		System.out.println(stk.b); // Accessing non-static variable
		stk.m2();
		stk.m3();

	}

}
