// Session 13
/* If we don't use this keyword, control will not understand
 * to which variable it should assign the values, whether to local variables 
 * inside method or to instance variables declared at class level.
 * 
 * 1) If we run the program, compiler will show the default value of integer.
 *    i.e. 
 *        x = 0 , y = 0
 * 2) If we use this keyword and run the program, control will assign the values 
 *    to the instance variables properly.
 *    i.e.
 *        x = 15 , y = 25       
*/
package thisAndStaticKeywords;

public class ThisKeyword2 {

	int x, y; // instance variable
/*
	public ThisKeyword2(int x, int y) { // local variable in Parameterized Constructor
		this.x = x;  // Used this keyword
		this.y = y;  // Used this keyword
	}
*/	
	void setData(int x, int y) { // local variable in User Defined Method
		this.x = x;
		this.y = y;
	}

	void display() {
		System.out.println(x); // 15
		System.out.println(y); // 25
	}

	public static void main(String[] args) {

// 1) In case of constructor, no need to create object of class		
//		ThisKeyword2 th = new ThisKeyword2(15, 25);
//		th.display();

// 2) In case of method, need to create object of class				
		ThisKeyword2 th = new ThisKeyword2(); // Class 2 - object
		th.setData(40, 50);
		th.display();

	}

}
