package oops.methodOverriding;

class Bank {

//	if the method has parameters, all the overriding methods should have 2 parameters.
	double returnOnInvestment() { 
		return 0;                 
	}
}

class ICICI extends Bank {

	double returnOnInvestment() {
		return 10.5;
	}
}

class SBI extends Bank {

	double returnOnInvestment() {
		return 11.5;
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		ICICI ic = new ICICI();
		System.out.println(ic.returnOnInvestment());
		
		SBI sb = new SBI();
		System.out.println(sb.returnOnInvestment());

	}

}
