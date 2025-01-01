package array;

public class CountDuplicatesInArrayByForEachLoop {

	public static void main(String[] args) {

		int a[] = { 100, 200, 100, 300, 100, 400, 100, 200 };
		int num = 200; 
		int count = 0; // Initially count is Zero
		
		for (int ele : a) {
			
			if (ele == num) {
				count++;
			}
		}
		System.out.println(count);
	}

}
