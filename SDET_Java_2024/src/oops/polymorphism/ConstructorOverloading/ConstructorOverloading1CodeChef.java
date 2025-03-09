package oops.polymorphism.ConstructorOverloading;

class Person {
	String name;
	int age;
	String gender;

	// First constructor with 2 parameters
	public Person(String n, int a) {
		name = n;
		age = a;
	}

	// Second constructor with 3 parameters
	public Person(String n, int a, String g) {
		name = n;
		age = a;
		gender = g;
	}
}

public class ConstructorOverloading1CodeChef {

	public static void main(String[] args) {

		// Create an object that passes 2 arguments to call the first constructor
		Person p1 = new Person("Alice", 25);
		// Create an object that passes 3 arguments to call the second constructor
		Person p2 = new Person("Bob", 30, "Male");
		System.out.println(p1.name + " is " + p1.age + " years old");
		System.out.println(p2.name + " is a " + p2.age + " years old " + p2.gender);

	}

}
