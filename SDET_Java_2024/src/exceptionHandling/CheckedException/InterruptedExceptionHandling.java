package exceptionHandling.CheckedException;

public class InterruptedExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Program started....");
		System.out.println("Program in progress....");
		
		try {
			Thread.sleep(5000); 
		} catch (java.lang.InterruptedException e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println("Programm run for 5000 milliseconds");
		System.out.println("Program ended....");

	}

}
