package oops.polymorphism.ConstructorOverloading;

class BankAccount {
	double balance;
	String holdername;

	public BankAccount(String n) {
		holdername = n;
	}

	public BankAccount(double b) {
		balance = b;
	}

	void displayName() {
		System.out.println("Account holder name: " + holdername);
	}

	void displayBalance() {

		System.out.println("Balance: $" + balance);
	}
}

public class ConstructorOverloading2CodeChef {

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount("John");
		BankAccount b2 = new BankAccount(1000);
		b1.displayName();
		b2.displayBalance();

	}

}
