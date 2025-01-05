package oops.encapsulation;

public class BankMain {

	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount();
		
//		acc.accno; 
		
//		We cann't access variable through object. It gives error.
//		We have to use getters and setters methods to access those variables.
		
		acc.setAccno(101);
		acc.setName("Vivek");
		acc.setAmount(56000.50);
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());

	}

}
