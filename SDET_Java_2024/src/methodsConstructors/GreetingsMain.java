package methodsConstructors;

public class GreetingsMain {

	public static void main(String[] args) {

//		Type 1) No parameters  No return value
		Greetings gr = new Greetings();
		gr.m1();

//		Type 2) No parameters  Return value		

		// System.out.println(gr.m2());
		String s = gr.m2();
		System.out.println(s);

//		Type 3) Takes parameters  No return value
		gr.m3("John");
		
//		Type 4) Takes parameters  Return value
		String t = gr.m4("David");
		System.out.println(t);

	}

}
