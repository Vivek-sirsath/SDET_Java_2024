package accessModifiers.package1;

public class Test1 {

	// default access modifier:-
	// default members can be accessible within same package1
	int x = 100; // default access modifier	
	void m1() { // default access modifier
		System.out.println("This is default m1 method of Test1 class");
	}
	
	// private access modifier:-
	// If we declare as private, they'll show error in class Test2
	// private members can be accessible only within class	 
	private int y = 200;	
	private void m2() {
		System.out.println("This is private m2 method of Test1 class");		
	}
	
	// protected access modifier:-
	// Accessible within the same package or subclasses in different packages.
	// We can not directly access outside of the package
	// Only through inheritance we can access protected members outside of the package
	protected int z = 300;
	protected void m3() {
		System.out.println("This is protected m3 method of Test1 class");
	}
	
	// public access modifier:-
	public int w = 400;
	public void m4() {
		System.out.println("This is public m3 method of Test1 class");
	}

}
