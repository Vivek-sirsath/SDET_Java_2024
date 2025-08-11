package constructor;

public class ParameterizedConstructor1 {

	int id; // Global Variable
	String name; // Global Variable
	String address; // Global Variable

	// Creating Default Constructor
	ParameterizedConstructor1() {
		System.out.println("This is default constructor");
	}

	// Creating Parameterized Constructor
	ParameterizedConstructor1(int a, String b, String c) {

		this.id = a;
		this.name = b;
		this.address = c;

	}

	// Creating non-static method
	public void printGlobalVariables() {
		System.out.println(id + "   " + name + "   " + address);
	}

	public static void main(String[] args) {
		ParameterizedConstructor1 pc1 = new ParameterizedConstructor1();
		// Output:- This is default constructor

// Create object of a class and pass the parameters to the constructor as arguments
		ParameterizedConstructor1 pc2 = new ParameterizedConstructor1(1, "John", "Miami");
		ParameterizedConstructor1 pc3 = new ParameterizedConstructor1(2, "Henry", "London");

		pc2.printGlobalVariables();  // 1   John   Miami
		pc3.printGlobalVariables();  // 2   Henry   London
	}
}
