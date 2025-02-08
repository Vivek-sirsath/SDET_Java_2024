package exceptionHandling.CheckedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Program started....");
		System.out.println("Program in progress....");
/*

// 1st Way:- Using 'try... catch...' block  

		try {
			FileInputStream fis = new FileInputStream("C:\\TextFile.txt");
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
				
*/	
		
// 2nd WAT:- Using 'throws' keyword
		
		FileInputStream fis = new FileInputStream("C:\\TextFile.txt");
		
		System.out.println("Exception handled");
		System.out.println("Program ended....");

	}

}
