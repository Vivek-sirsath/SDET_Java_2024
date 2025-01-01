package array;

import java.util.Arrays;

public class SortingElementsInArrayBySortMethod {

	public static void main(String[] args) {
		
		int a[] = {400, 600, 500, 100, 200};
		
		System.out.println("Before sorting...");
		System.out.println(Arrays.toString(a)); // [100, 600, 500, 400, 200]
		
		Arrays.sort(a);
		
		System.out.println("After Sorting...");
		System.out.println(Arrays.toString(a)); // [100, 200, 400, 500, 600]

	}

}
