package Lab;

public class InsertionSort {

	/* Function to sort array using insertion sort */
	public void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/* A utility function to print array of size n */
	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void printOdds(int arr[]) {
		int n = arr.length;
		int test;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				// create a new array to save into

				// created variable to save odd# in
				test = arr[i];
				System.out.print(arr[i] + " ");
				// checking if odd number saves to variable
				// System.out.print(test + " ");
			}
		}

		System.out.println();
	}

	// Sort a[0 .. (n-1)] into ascending order
	static void sortE(int a[], int n) {

		int possPlaceToIns; // index of possible location to insert the
							// first unsorted object
		int toInsert; // the int value to be inserted

		for (int firstuns = 1; firstuns < n; firstuns++) {
			// inv: a[0.. firstuns-1] is sorted

			if (a[firstuns] < a[firstuns - 1]) { // shift some of a [0.. firstuns-1] back to make place for a[firstuns]
				toInsert = a[firstuns]; // save value in toInsert,
				possPlaceToIns = firstuns; // now a possible place to insert is at firstuns
				do {
					possPlaceToIns--; // move the possible insertion place down by
					a[possPlaceToIns + 1] = a[possPlaceToIns]; // moving object there up
				} while ((possPlaceToIns > 0) && (toInsert < a[possPlaceToIns - 1]));
				a[possPlaceToIns] = toInsert; // found the right spot so put toInsert into it
			} // end if
				// inv: a[0.. firstuns] is sorted
		} // end for
	}
}
