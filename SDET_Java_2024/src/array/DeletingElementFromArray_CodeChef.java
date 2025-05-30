package array;

public class DeletingElementFromArray_CodeChef {

	public static void main(String[] args) {
		int[] array = new int[100]; // Initial array
		array[0] = 2;
		array[1] = 4;
		array[2] = 6;
		array[3] = 8;
		array[4] = 10;
		int size = 5; // Current size of the array

		int positionToDelete = 2; // Index of the element to delete

		// Shift elements to fill the gap left by the deleted element
		for (int i = positionToDelete; i < size - 1; i++) {
			array[i] = array[i + 1];
		}

		size--; // Update the size of the array

		// Print the updated array
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " "); // 2 4 8 10 
		}
	}

}
