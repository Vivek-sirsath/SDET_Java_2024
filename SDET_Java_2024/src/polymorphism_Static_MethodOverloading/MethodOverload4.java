package polymorphism_Static_MethodOverloading;

public class MethodOverload4 extends MethodOverload3 {

	public static void main(String[] args) {
		
		System.out.println(MethodOverload4.add(10, 5)); // 15
		System.out.println(MethodOverload4.add(20, 10, 10)); // 40
		
		System.out.println(MethodOverload3.add(10, 5)); // 15
		System.out.println(MethodOverload3.add(20, 10, 10)); // 40
		
		// Here we can use both 'MethodOverload3' as well as 'MethodOverload4'

	}

}
