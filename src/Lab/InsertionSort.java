package Lab;

public class InsertionSort {
	
	/*Function to sort array using insertion sort*/
    public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    /* A utility function to print array of size n*/
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
    public static void printOdds(int arr[])
    {
        int n = arr.length;
        int test;
        for(int i=0;i<arr.length;i++){  
            if(arr[i]%2!=0){  
            	//create a new array to save into
            	
            	//created variable to save odd# in
            	test = arr[i];
            System.out.print(arr[i] + " ");
            //checking if odd number saves to variable
            //System.out.print(test + " ");  
            }
            }
 
        System.out.println();
    }
	/*
	public static void printOdds(queue q) {
		// TODO Auto-generated method stub
		int[] arr = q.toArray();
		int n = arr.length;
		int test;
        for(int i=0;i<arr.length;i++){  
            if(arr[i]%2!=0){  
            	//create a new array to save into?
            	
            	//created variable to save odd# in
            	test = arr[i];
            System.out.print(arr[i] + " ");
            //checking if odd number saves to variable
            //System.out.print(test + " ");  
            }
            }
 
        System.out.println();
	}
*/
}
