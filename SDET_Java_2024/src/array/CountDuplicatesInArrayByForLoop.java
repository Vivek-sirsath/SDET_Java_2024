package array;

public class CountDuplicatesInArrayByForLoop {

	public static void main(String[] args) {

		int a[] = { 100, 200, 100, 300, 100, 400, 100, 200 };
		int num = 100;
		int count = 0;
		
		for(int i = 0; i<a.length; i++) {
			
			if(a[i] == num ) {
				count++;
				
			}
		}
		System.out.println(count);  // 4
		
	}
	
}
