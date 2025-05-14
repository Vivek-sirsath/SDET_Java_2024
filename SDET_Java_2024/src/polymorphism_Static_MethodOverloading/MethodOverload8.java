package polymorphism_Static_MethodOverloading;

public class MethodOverload8 {

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void sum(long a, long b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		MethodOverload8 mo8 = new MethodOverload8();
		mo8.sum(10, 5);  // 15

		/*
		 * If we hover the mouse over sum(), it will show sum(int, int) got selected.
		 * Means control will select by default the method which gets less memory
		 * allocation. 
		 * Here 'int' takes less memory than 'long'.
		 */
	}

}
