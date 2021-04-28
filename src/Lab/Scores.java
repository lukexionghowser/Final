package Lab;

import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;


public class Scores {

	public static Stack<Double> stackOE = new Stack<Double>();
	public static Stack<Double> stackM = new Stack<Double>();
	public static Stack<Double> stackS = new Stack<Double>();
	public static Stack<Integer> oddList = new Stack<Integer>();
	public static Stack<Integer> evenList = new Stack<Integer>();
	static Stack<Integer> countStack = new Stack<Integer>();
	static Stack<Integer> countPlays = new Stack<Integer>();
	public static Stack<Integer> countIncorrect = new Stack<Integer>();
	public static Stack<Integer> countShapes = new Stack<Integer>();
	public static Stack<Integer> wrongShapes = new Stack<Integer>();
	public static Stack<Integer> countMath = new Stack<Integer>();
	public static Stack<Integer> wrongMath = new Stack<Integer>();
	public static Stack<Integer> countCircle = new Stack<Integer>();
	public static Stack<Integer> countTriangle = new Stack<Integer>();
	public static Stack<Integer> countSquare = new Stack<Integer>();
		
	public static PriorityQueue<Priority> games = new PriorityQueue<Priority>(3, new The_Comparator());
	
	//convert priorityqueue to array
	static String[] arr1 = new String[3];
	static String[] arr2 = games.toArray(arr1);
	
	SelectionSort ob = new SelectionSort();
	
	public static void queueScore(String score, String gName) {

		Priority p1 = new Priority(score, gName); //may need to update parameters 
		games.add(p1);
		
	}
	
	public static void countOdd(int o) {
		int wrong = 0;

		int oddWrong = wrong + o;

		countStack.set(0, oddWrong);
		return;

	}

	public static void countEven(int e) {
		int wrong = 0;

		int evenWrong = wrong + e;

		countStack.set(1, evenWrong);
		return;
	}

	public static void totalPlays(int x) {
		int plays = 0;
		countPlays.set(0, plays);
		return;
	}

	public static String totalOddEven() {

		int incorrect = countIncorrect.size();

		double totalPlays = oddList.size() + evenList.size();
		double difference = totalPlays - incorrect;
		double finalScore1 = difference / totalPlays;

		double total = finalScore1 * 100;
		
		stackOE.add(total);
		
		String score1 = Double.toString(total);
		
		//Priority g1 = new Priority(score1, "Odd/Evens");
		//games.add(g1);

		return score1;

	}


	public static String printQueue() {
		String name ="";
		String score="";
		avgScores();
    	while(!Scores.games.isEmpty()) {
			name = (games.poll().getGame());
			score = (games.poll().getScore()); ///error
		}
		//return game + ": " + score;
    	
    	return name +" : " + score;
    	// returns correct format - only first time/doesnt update
    }
	
	public String toString() {
		
		while (!games.isEmpty()) {
			System.out.println(games.poll().getGame()); //Prints string game before score
			System.out.println(games.poll().getScore());
			
			//will need to update this to setText for label on Score Panel
		}
		return games.toString();
		//its only returning the name and not scores
	}
	public static String totalMath() {

		int incorrect = wrongMath.size();

		double totalPlays = countMath.size();
		double difference = totalPlays - incorrect;
		double finalScore1 = difference / totalPlays;

		double total = finalScore1 * 100;
		
		stackM.add(total);
		
		String score1 = Double.toString(total);
		
		//Priority g3 = new Priority(score1, "Math");
		//games.add(g3);

		//return score1 + " %";
		return score1 ;
	}

	public static String totalShape2() {
		
		double incorrect = wrongShapes.size();
		
		double circle = countCircle.size();
		double square = countSquare.size();
		double triangle = countTriangle.size();
		
		double totalPlays = 3.0;
		double sum = circle+square+triangle;
		double difference = totalPlays - incorrect;
		double finalScore3 = difference / totalPlays;
		
		double total = finalScore3 * 100;
		
		stackS.add(total); //use this for queue? set in specific position
		//should it be stack.add(total);
		
		String score3 = Double.toString(total);
		
		//Priority g2 = new Priority(score3, "Shapes");
		//games.add(g2);
		
		return score3;
		//return score3 + " %";
		
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
	
	public static String avgScores() {

		String x = "";
		
		Priority g1 = new Priority(oeStackSum(stackOE), "Odds/Evens");
		games.add(g1);
		Priority g2 = new Priority(mStackSum(stackM), "Math");
		games.add(g2);
		Priority g3 = new Priority(sStackSum(stackS), "Shapes");
		games.add(g3);
		


		/*
		Priority g1 = new Priority("1", "Odds/Evens");
		games.add(g1);
		Priority g2 = new Priority("2", "Math");
		games.add(g2);
		Priority g3 = new Priority("3", "Shapes");
		games.add(g3);
		*/
		
		while (!games.isEmpty()) {
			String p1 = (games.poll().getGame()); //Prints string game before score
			String p2 = (games.poll().getScore());
			
			x = p1 + " : " + p2; 
			//x = p2 + " ";
		}
		return x;
		
		// returns [Shapes, Shapes, Shapes]
		// games.toString();
		
		/*
		//// this method displays Shape: 100 only
		while (!games.isEmpty()) {
			String p1 = (games.poll().getGame()); //Prints string game before score
			String p2 = (games.poll().getScore());
			
			String p3 = (games.poll().getGame()); //Prints string game before score
			String p4 = (games.poll().getScore());
			
			String p5 = (games.poll().getGame()); //Prints string game before score
			String p6 = (games.poll().getScore());
			
			x = p1 + " : " + p2 + " " + p3 + " : " + p4 + " " + p5 + " : " + p6; 
		}
		return x;
		*/
		
		
		/*
		///// this method is only showing [Shapes, Shapes,etc]
		for (int i =0; i< games.size(); i++)
		{
			x = (games.toString() + " ");
		}
		return x;
		*/
	}
	
	public static String SelectionSorter() {
		
		//Object[] arr = games.toArray();
		
		//String[] arrS = arr;
		String print = "";
		String print2 = "";
		//for (int j=0; j < arr.length; j++)
			//SelectionSort.printArray(arr[j]);
		
		for (int i = 0; i<arr1.length; i++) {
			System.out.println("Contents1: " + arr1[i]);
		print = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Contents2" + arr2[i]);
			print2 = arr2[i];
		}
		/*
		for (int j=0; j < arr.length; j++)
		{
			int min = j;
			for (int k=j+1; k < arr.length; k++)
				if (arr[k].compareTo( arr[min]) < 0 ) min = k;
			
			String temp = arr[j];
			arr[j] = arr[min];
			arr[min] = temp;
		}
		return; */
		return print2;
	} 
}
