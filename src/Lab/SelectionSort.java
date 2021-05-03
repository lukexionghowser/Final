package Lab;

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
	/*
	private void sortString() {

	    for (int i = 0; i < Scores.stackM.size() - 1; i++) {
	        for (int j = i + 1; j < Scores.stackM.size(); j++) {
	            if (Scores.stackM.get(i).compareTo(Scores.stackM.get(j)) == 1) {

	                Word temp = Scores.stackM.get(i);
	                Scores.stackM.set(i, Scores.stackM.get(j));
	                Scores.stackM.set(j, temp);
	            }
	        }
	    }
	}
	
	public int compareTo(Word w) {
	    return this.word.compareTo(w.word);
	}
	
	/*
	public void sort(String arr[]) {
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
*/
	// Prints the array
	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
