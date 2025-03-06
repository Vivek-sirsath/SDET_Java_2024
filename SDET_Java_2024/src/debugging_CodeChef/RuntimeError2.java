package debugging_CodeChef;

public class RuntimeError2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Array initialization
        
        // Accessing the first element of the array (index 0)
        System.out.println(arr[0]); // It will print 1
        
        // Attempting to access an element at a negative index
        // This will produce an "ArrayIndexOutOfBoundsException" at runtime.
        System.out.println(arr[-1]);
        
        // Attempting to access an element beyond the bounds of the array
        // This will also produce an "ArrayIndexOutOfBoundsException" at runtime.
        System.out.println(arr[5]);
    }
}
