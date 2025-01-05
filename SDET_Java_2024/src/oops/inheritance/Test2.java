package oops.inheritance;

// Multilevel inheritance


class Class1 {
	int a;
	int b;
	
	public void display() {
		System.out.println(a+b);
	}
}

class Class2 extends Class1 {       // B-child using the methods and variables of A-parent
	
	int x;
	int y;
	
	public void show() {
		System.out.println(x+y);
	}
}

class Class3 extends Class2 {
	
	int p;
	int q;
	
	public void addition() {
		System.out.println(p+q);
	}
}

public class Test2 {
	
	public static void main(String[] args) {
		
		Class3 pobj = new Class3();
		
		pobj.a=1;
		pobj.b=2;
		pobj.x=3;
		pobj.y=4;
		pobj.p=5;
		pobj.q=6;
		
		pobj.display(); // 3
		pobj.show(); // 7
		pobj.addition(); // 11
		

	}

}
