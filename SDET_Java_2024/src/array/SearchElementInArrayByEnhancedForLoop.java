package array;

public class SearchElementInArrayByEnhancedForLoop {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int search_elemnt = 4;
		boolean isFound = false; // Default value is false (false - Not Found), (true - Found)

		for (int x : a) {
			if (x == search_elemnt) {
				System.out.println("Element Found");
				isFound = true;
				break;
			}
		}
		if (isFound == false) {
			System.out.println("Element Not Found");
		}
	}

}
