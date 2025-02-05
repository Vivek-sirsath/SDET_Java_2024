package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		String s1 = null;
		
		try
		{
		System.out.println(s1.length());
		}
		catch(NullPointerException e)
		{
		System.out.println(e.getMessage());
		System.out.println("catch block handled the NullPointerException");
		}
		finally
		{
		System.out.println("finally block is executing");	
		}

	}

}
