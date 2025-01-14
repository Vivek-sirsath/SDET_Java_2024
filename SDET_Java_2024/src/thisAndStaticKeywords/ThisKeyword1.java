// Session 13
/* If we don't use this keyword, control will not understand
 * to which variable it should assign the values, whether to local variables 
 * inside method or to instance variables declared at class level.
 * - If we run the program, compiler will show the default value of integer.
 *   i.e. 
 *        x = 0 , y = 0
*/
package thisAndStaticKeywords;

public class ThisKeyword1 {

	int x, y; // instance variable
/*
	public ThisKeyword1(int x, int y) { // local variable in Parameterized Constructor
		x = x;  // Not used this keyword
		y = y;  // Not used this keyword
	}
*/	
	void setData(int x, int y) { // local variable in User Defined Method
		x = x;
		y = y;
	}

	void display() {
		System.out.println(x); // 0
		System.out.println(y); // 0
	}

	public static void main(String[] args) {
		
// 1) In case of constructor, no need to create object of class
//		ThisKeyword1 th = new ThisKeyword1(15, 25);
//		th.display();

// 2) In case of method, need to create object of class		
		ThisKeyword1 th = new ThisKeyword1();
		th.setData(100, 200);
		th.display();

	}

}
