package constructor;

public class ConstructorOverloading1 {
	
	ConstructorOverloading1(){
		System.out.println("No argument constructor");
	}
	
	ConstructorOverloading1(int a){
		System.out.println("Int argument constructor");
	}
	
	ConstructorOverloading1(String b){
		System.out.println("String argument constructor");
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading1 co1 = new ConstructorOverloading1();
		ConstructorOverloading1 co2 = new ConstructorOverloading1(1);
		ConstructorOverloading1 co3 = new ConstructorOverloading1("Selenium");
		
	}

}
