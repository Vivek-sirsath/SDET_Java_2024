package oops.inheritance;

// Single level inheritance
class A{
	int a;
	int b;
	
	public void display() {
		System.out.println(a+b);
	}
}

class B extends A{       // B-child using the methods and variables of A-parent
	
	int x;
	int y;
	
	public void show() {
		System.out.println(x+y);
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		// Object creation of class A
		A aobj = new A();
		aobj.a=100;
		aobj.b=200;
		aobj.display();
		
		// Object creation of class B
		B bobj = new B();
		bobj.x=10;
		bobj.y=20;
		bobj.show();
		
		// B class object can use the methods and variables of class A also, due to inherited
		bobj.a=700;
		bobj.b=200;
		bobj.display();
		
	}

}
