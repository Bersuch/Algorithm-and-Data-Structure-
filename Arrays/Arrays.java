package Basics;

public class Arrays {
	
	public static void main(String[] args) {
		
		int N = 10;
		
		int[] a = new int[N];
		
		
		// just fill Array with zeros
		for(int i = 0; i < a.length; i++) {
			a[i] = 0;
		}
		
		// Find Max Value of an Array
		double max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];			}
		}
		
		// Calculate average
		int S = a.length;
		double sum = 0.0;
		for(int i = 0; i < S; i++) {
			sum += a[i];
		}
		double average = sum / N;
		
		// Copy one Array to another
		double[] b = new double[N];
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		// Reverse Array
		for(int i = 0; i < a.length; i++) {
			int temp = a[i];
			a[i] = a[a.length -1 -i];
			a[a.length -1 -i] = temp;
		}
		
		// Shuffle Array
		for(int i = 0; i < a.length; i++) {
			int r = i + StdRandom.uniform(a.length - i);
			int temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}

}
