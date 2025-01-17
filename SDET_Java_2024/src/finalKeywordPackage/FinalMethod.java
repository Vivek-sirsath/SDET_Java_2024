package finalKeywordPackage;

/*
 * If we create a method with final keyword in parent class,
 * it cann't override in child class.
 * It will show error and a suggestion "Remove 'final' modifier of 'Test1.m1'(...)"
 * */

class Test1 { // Parent class

//	final void m1() {
	void m1() { // After removing final keyword here, error goes
		System.out.println("This is normal method of Test1 class");
	}
}

class Test2 extends Test1 { // Child class
	void m1() { // Invalid bcause m1() is final method.
		System.out.println("This is normal overriden method of Test2 class");
	}
}

public class FinalMethod {

	public static void main(String[] args) {

	}

}
