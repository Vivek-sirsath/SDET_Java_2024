package finalKeywordPackage;

class Test {
	int x = 100; // normal variable
	final int y = 50; // Final variable / Constant
} 

public class FinalVariable {

	public static void main(String[] args) {

		Test t = new Test();
		t.x = 200;
//		t.y = 400; // Showing Compile time error: Remove 'final' modifier of y

		System.out.println(t.x);

	}

}
