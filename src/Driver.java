import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

import Lab.InsertionSort;
import Lab.Priority;
import Lab.Scores;
import Lab.The_Comparator;

public class Driver {
	
	public static void main(String args[])
    {
		
		//Scores.stackM.toString(); //blank
		
		System.out.println(Scores.stackM); //prints []
		//Stack<Double> m = Scores.stackM; //blank
		///////////////////////
		//TRY A DIFFERENT DATA STRUCTURE
		/////////////////////
		
		/*
		PriorityQueue<String> queue = new PriorityQueue<String>();
		  
        // Use add() method to add elements into the Queue
        queue.add("Welcome");
        queue.add("To");
        queue.add("Geeks");
        queue.add("4");
        queue.add("Geeks");
  
        // Displaying the PriorityQueue
        System.out.println("PriorityQueue: " + queue);
  
        // Creating an iterator
        Iterator value = queue.iterator();
  
        // Displaying the values after iterating through the queue
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    */
		/*
		Stack<Double> practice1 = new Stack<Double>();
		Stack<Double> practice2 = new Stack<Double>();
		Stack<Double> practice3 = new Stack<Double>();
		
		practice1.add(1.0);
		practice2.add(2.0);
		practice3.add(3.0);
		
		PriorityQueue<Priority> test = new PriorityQueue<Priority>(3, new The_Comparator());
		
		Priority g1 = new Priority("9", "Odds/Evens");
		test.offer(g1);
		
		System.out.println(test.size());
		Priority g2 = new Priority("10", "Math");
		test.offer(g2);
		System.out.println(test.size()); 
		//verified size is 2
		Priority g3 = new Priority("11", "Shapes");
		test.offer(g3);
		
		/*
		Priority g1 = new Priority(sStackSum(practice1), "Odds/Evens");
		test.add(g1);
		Priority g2 = new Priority(oeStackSum(practice2), "Math");
		test.add(g2);
		Priority g3 = new Priority(mStackSum(practice3), "Shapes");
		test.add(g3);
		
		
		System.out.println(test);
		
		System.out.println(test.size()); 
		//verified size is 3
		
		
		while (!test.isEmpty()) {
			System.out.println(test.poll().getGame()); //Prints string game before score
			System.out.println(test.poll().getScore());
			//prints name of game/score on a line - but not all the games/scores
		}
		
		/*
		Priority g1 = new Priority("1", "Odds/Evens");
		test.add(g1);
		Priority g2 = new Priority("2", "Math");
		test.add(g2);
		Priority g3 = new Priority("3", "Shapes");
		test.add(g3);
		*/
		
		//System.out.println(Arrays.deepToString(test.toArray()));
		//prints [Shapes, Shapes, Shapes]
		/*
		
		System.out.println(test.toString());
		//prints [Shapes, Shapes, Shapes]
		
		Iterator value = test.iterator();
		
		while (value.hasNext()) {
			System.out.println(value.next());
		}
		//prints Shapes on 3 lines
		
		System.out.println(test);
		//prints [Shapes, Shapes, Shapes]
		
		while (!test.isEmpty()) {
			System.out.println(test.poll().getGame()); //Prints string game before score
			System.out.println(test.poll().getScore());
			//prints name of game/score on a line - but not all the games/scores
		}
		
		//prints nothing
		System.out.println(g1.toString());
		// just prints boolean
		System.out.println(test.add(g1));
		
		System.out.println(test.peek()); //prints Shapes
		
		System.out.println(test.contains("Math")); //boolean
		// this returns false
		System.out.println(test.contains(g1)); //boolean
		// this returns TRUE
		
		System.out.println(test.comparator());
		//this returns @
		
		System.out.println(test.element());
		//this returns Shapes
		
		test.element();
		//prints nothing
		
		System.out.println(test.iterator());
		//prints weird string
		
		System.out.println(test.poll());
		//prints Shapes
		
		/*
		Iterator value = test.iterator();
		
		while (value.hasNext()) {
			System.out.println(value.next());
		}
		
		System.out.println(test);
		//prints []
		
		
		/*
		//convert priorityqueue to array
		String[] arr1 = new String[3];
		String[] arr2 = test.toArray(arr1);
		
		String print = "";
		String print2 = "";
		//for (int j=0; j < arr.length; j++)
			//SelectionSort.printArray(arr[j]);
		
		for (int i = 0; i<arr2.length; i++) {
			System.out.println("Contents1: " + arr1[i]);

		}
		
		/*
        int arr[] = { 12, 11, 13, 5, 6 };
 
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
 
        System.out.println("Insertion Sort Array:"); 
        InsertionSort.printArray(arr);
        
        System.out.println("Odd Numbers:");  
        InsertionSort.printOdds(arr);
        */
        
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

	public static String oeStackSum(Stack<Double> stackOE) {
		double sum = 0;
		double avg = 0;
		double size = stackOE.size();
		String aScore = "";
		while (!stackOE.isEmpty()) {
			double n = stackOE.pop();
			sum += n;		
			avg = sum/size;
			aScore = Double.toString(avg);
		}
		return aScore;
	}
	public static String mStackSum(Stack<Double> stackM) {
		double sum = 0;
		double avg = 0;
		double size = stackM.size();
		String aScore = "";
		while (!stackM.isEmpty()) {
			double n = stackM.pop();
			sum += n;		
			avg = sum/size;
			aScore = Double.toString(avg);
		}
		return aScore;
	}
	public static String sStackSum(Stack<Double> stackS) {
		double sum = 0;
		double avg = 0;
		double size = stackS.size();
		String aScore = "";
		while (!stackS.isEmpty()) {
			double n = stackS.pop();
			sum += n;		
			avg = sum/size;
			aScore = Double.toString(avg);
		}
		return aScore;
	}
	

}
