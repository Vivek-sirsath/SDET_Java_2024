/*
 * Constructor:- 
 * 1. It is just a block of code same as method
 * 2. Constructor is called when an object of a class is created
 * 3. Constructor name must be same as its class name
 * 4. Constructor can't be abstract, static, final
 * 
 * Types:-
 * 1) Default Constructor - Don't have any parameters as an argument 
 * 2) Parameterized Constructor - Will have parameters as an argument
 *  
 */

package constructor;

public class DefaultConstructor1 {
	
	DefaultConstructor1() {
		System.out.println("This is default constructor");
	}
	
	public static void main(String[] args) {
		DefaultConstructor1 dc1 = new DefaultConstructor1();
	}

}

// This is default constructor 




