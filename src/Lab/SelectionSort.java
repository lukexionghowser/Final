package Lab;

import java.util.Stack;

public class SelectionSort {

	// code from https://www.geeksforgeeks.org/selection-sort/
	public void sort(int arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	public static int[] addX(int n, int arr[], int x) {
		int i;

		int newarr[] = new int[n + 1];

		for (i = 0; i < n; i++)
			newarr[i] = arr[i];

		newarr[n] = x;

		return newarr;
	}

	public static void selectionSort(Object[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			// Find the index of the minimum item, starting at `i'.
			int minIndex = i;
			for (int j = i + 1; j < data.length; j++) {
				if (((Comparable) data[j]).compareTo(data[minIndex]) < 0)
					minIndex = j;
				// Exchange with the first item (at `i'), but only if different
				if (i != minIndex) {
					Object tmp = data[i];
					data[i] = data[minIndex];
					data[minIndex] = tmp;
				}
			}
		}
	}

	// Prints the array
	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void printObject(Object arr[]) {
		String ex;
		for (int i = 0; i < arr.length; i++) {
			ex = arr[i].toString();
		}
	}

	public static void printObject2(Object selectionSort) {
		Object[] arr = {};
		String ex2;
		for (Object Object : arr)
			ex2 = (Object + " ");

	}

}
