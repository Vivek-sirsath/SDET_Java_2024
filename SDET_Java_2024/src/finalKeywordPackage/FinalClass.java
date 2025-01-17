package finalKeywordPackage;
/*
 * If we create a class with final keyword,
 * it cann't extent to child class.
 * It will show error and a suggestion "Remove 'final' modifier of 'TestClass1'"
 */

// final class TestClass1 { // Parent class
class TestClass1 { // After removing final keyword here, error goes

	void m1() {
		System.out.println("This is normal method of Test1 class");
	}
}

class TestClass2 extends TestClass1 { // Child class
	void m1() { // Invalid bcause m1() is final method.
		System.out.println("This is normal overriden method of Test2 class");
	}
}

public class FinalClass {

	public static void main(String[] args) {

	}

}
