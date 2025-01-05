// Session 12

package oops.polymorphism.MethodOverloading;

public class MainMethodOverloading {

	void main(int a) {
		System.out.println(a);
	}
	
	void main(String s) {
		System.out.println(s);
	}
	
	void main(String s1, String s2) {
		System.out.println(s1 +" " + s2);
	}

	public static void main(String[] args) {
		
		MainMethodOverloading mainObj = new MainMethodOverloading();
		mainObj.main(500);
		mainObj.main("Ishita");
		mainObj.main("Hello", "Java");

	}

}
