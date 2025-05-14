package polymorphism_Static_MethodOverloading;

import org.testng.Assert;

/* 
   This is Compile time Polymorphism 
   Method name is same but parameters are different in Method Overloading
   Another example of method overloading is in Assertion
   e.g. 
         Assert.assertEqual(int actual , int expected);
         Assert.assertEqual(char actual , char expected);
         Assert.assertEqual(string actual , string expected);
         
         Here method name same - assertEqual()
         But, parameters are different
   
*/

public class MethodOveerload1 {

	public void sum(int a , int b) {
		System.out.println(a+b);
	}
	public void sum(int a , int b, int c) {
		System.out.println(a+b-c);
	}
	
}
