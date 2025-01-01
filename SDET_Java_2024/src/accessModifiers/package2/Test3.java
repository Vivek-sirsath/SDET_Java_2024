package accessModifiers.package2;

import accessModifiers.package1.Test1;

public class Test3 extends Test1 {

	public static void main(String[] args) {
		
		// Here the example of use of protected variable and protected methods
		// If protected access modifier used in Test1 class in package1
		// Then, error comes - 'The method m3() from the type Test1 is not visible'
		// To resolve the error we need to declare variable and method as public.
		
		
		// We can not create object of Test1 class in 'package2'
		// Because Test1 belongs to different package 'package1'
		// To resolve the error, we need to import the package1 here
		// [import accessModifiers.package1.Test1;]
		// Then we can access members of Test1 class of package1
		
		Test3 t3 = new Test3();		
		t3.m3();
		System.out.println(t3.z);

	}

}
