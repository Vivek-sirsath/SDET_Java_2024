package polymorphism_Runtime_MethodOverriding;

public class MethodOverride7 {

	public static void main(String[] args) {
		
		MethodOverride5 mo5 = new MethodOverride6(); // Dynamic method dispatch
		mo5.cook(); // Sister is cooking // Overridden the cook() method of MethodOverride5
		mo5.handWash(); // Daily handWash
//		mo5.angry();  Error: The method angry() is undefined for the type MethodOverride5

	}

}
