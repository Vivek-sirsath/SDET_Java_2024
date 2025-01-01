package array;

// Search element in array (Linear Search)

public class SearchElementInArrayByForLoop {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		int search_element = 70;
		boolean isFound = false; // Default value is false (false - Not Found), (true - Found)

		for (int i = 0; i < a.length; i++) {

			if (a[i] == search_element) {
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
