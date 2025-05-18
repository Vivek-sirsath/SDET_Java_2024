package polymorphism_Runtime_MethodOverriding;

public class MethodOverride2 extends MethodOverride1 {
	
	public void eat() {
		System.out.println("You are eating");
	}

	public static void main(String[] args) {
		
//		MethodOverride1 mo1 = new MethodOverride1();
//		mo1.eat();  // I am eating
		
		MethodOverride2 mo2 = new MethodOverride2();
		mo2.eat();  // You are eating

	}

}
