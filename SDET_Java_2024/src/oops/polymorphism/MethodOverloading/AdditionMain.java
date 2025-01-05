package oops.polymorphism.MethodOverloading;

public class AdditionMain {

	public static void main(String[] args) {
		
		Addition adObj = new Addition();
		
		adObj.sum();
		adObj.sum(45, 5);
		adObj.sum(5, 10.2);
		adObj.sum(50.5, 20);
		adObj.sum(100, 200, 300);

	}

}
