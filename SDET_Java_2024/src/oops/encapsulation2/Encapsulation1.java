
/* Encapsulation :- 
   - Binding the code in to a single unit.
   - 'final' and 'this' keywords used in encapsulation
   - getters() and setters() methods generally used in encapsulation
   
   final keyword:-
   1) It is used to restrict the user
   2) If we declare any variable as final then, it can't be changed
   3) final can be variable, method, class
   4) final variable can't change
   5) final method can't override
   6) final class can't be extended or can't be inherited
   
   this keyword:-
   1) It is a reference variable, which can be used to refer the current class instance variable 
*/
package oops.encapsulation2;

public class Encapsulation1 {

	String name; // name is a variable that we are passing
	int b;
	final int c = 2;

	public void setName(String a) {
		this.name = a;
		this.b = 5;
		System.out.println(b);
		System.out.println(c);
	}

	public Object getName() {
		return name;

	}
}
