package methodsConstructors;

class Person {
	  String name;
	  int age;
	  String address;

	  //Create a class constructor for the 'Person' class
	  public Person(String n, int a, String addr) {
	    name = n;
	    age = a;
	    address = addr;
	  }
	}

public class ConstructorCodeChef {
    public static void main(String[] args) {   
        
        // Create an object of class 'Person' (This will call the constructor)  
        Person p = new Person("John", 25, "123 Main St");
        System.out.println(p.name + " is " + p.age + " and lives at " + p.address);        
    }
}
