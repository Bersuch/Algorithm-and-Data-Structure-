package Basics;

public class Insertionsort {
	
	/* 
	 * 
	 * Values from the unsorted part are picked and placed at the correct position in the sorted part
	 *
	 * Time Complexity: O(n^2) because of nested loops
	 */
	
	
	// Example 1
	public static void Insertionsort1(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			// Set a[i] between a[i-1], a[i-2], a[i-3] etc.
			for(int j = i; j > 0 && (array[j] < array[j-1]); j--) {
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
			}
		}
	
		// Testing
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	
	// Example GeeksForGeeks
	// Autor: 
	public static void main(String[] args) {
		
		
		int[] a = {5, 2, 55, 24, 68, 18};
		
		Insertionsort1(a);
	}
	
}
