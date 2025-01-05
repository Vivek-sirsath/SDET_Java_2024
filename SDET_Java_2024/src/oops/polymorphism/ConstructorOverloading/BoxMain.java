// Session 12

package oops.polymorphism.ConstructorOverloading;

public class BoxMain {

	public static void main(String[] args) {

		Box b1 = new Box();

		System.out.println(b1.volume()); // 0.0

//		Unlike methods, by same object we cann't invoke 
//		all types of constructors

//		For that, we've to create new objects

		Box b2 = new Box(10.5, 5.2, 4.12);
		System.out.println(b2.volume()); // 224.952
		
		Box b3 = new Box(5);
		System.out.println(b3.volume());

	}

}
