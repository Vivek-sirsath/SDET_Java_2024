package polymorphism_Static_MethodOverloading;

public class MethodOverload2 extends MethodOveerload1{

	public static void main(String[] args) {
		
		MethodOverload2 mo2 = new MethodOverload2();
		mo2.sum(25, 15);  // 40
		mo2.sum(25, 15, 20); //20
		mo2.sum(10, 5, 20); // -5

	}

}
