import Lab.InsertionSort;

public class Driver {
	
	public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };
 
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
 
        System.out.println("Insertion Sort Array:"); 
        InsertionSort.printArray(arr);
        
        System.out.println("Odd Numbers:");  
        InsertionSort.printOdds(arr);
        
        /*
        //defining odd
        System.out.println("Odd Numbers:");  
        for(int i=0;i<arr.length;i++){  
        if(arr[i]%2!=0){  
        System.out.println(arr[i]);  
        }
        }
        //defining even
        System.out.println("Even Numbers:");  
        for(int i=0;i<arr.length;i++){  
        if(arr[i]%2==0){  
        System.out.println(arr[i]);  
        }  
        }
        */
    }

}
