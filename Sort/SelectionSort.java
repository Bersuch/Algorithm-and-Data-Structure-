package Basics;

public class SelectionSort {
	
	/* The SelectionSort Algorithm sorts an array by finding the 
	 * minimum element from an unsorted part and putting it 
	 * at the beginning
	 *
	 * Time Complexity: O(n^2) because of nested loops
	 */

	
	// SelectionSort
	
	public static void main(String[] args) {
		
	
	int[] a = {5, 2, 55, 24, 68, 18};
	
	
		for(int i = 0; i < a.length; i++) {
			int min = i;
			for(int j = i+1; j < a.length; j++) { 
				// Checks if the current Value is less than the key 
				if(a[j] < a[min]) {
					min = j;
				}
			}
			
			// Swap the found minimum element with the first element
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		
		// Testing
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
