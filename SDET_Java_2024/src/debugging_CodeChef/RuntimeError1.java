package debugging_CodeChef;

import java.util.Scanner;

public class RuntimeError1 {
	
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a = scanner.nextInt();
        System.out.println("Enter the value of b:"); // Assign b = 0 , Arithmetic Exception
        b = scanner.nextInt();
        /*
        if (b == 0) {
            System.out.println("infinity");   // uncomment the if condition
            return;
        }
        */
        
        System.out.println(a / b);  
        
        /* 
           RuntimeError1 [Java Application]	
		   Thread [main] (Suspended (uncaught exception ArithmeticException))	
		   RuntimeError1.main(String[]) line: 21	
		*/

    }
}
