package Lab;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;


public class Scores {

	static Stack<Double> stack = new Stack<Double>();
	public static Stack<Integer> oddList = new Stack<Integer>();
	public static Stack<Integer> evenList = new Stack<Integer>();
	static Stack<Integer> countStack = new Stack<Integer>();
	static Stack<Integer> countPlays = new Stack<Integer>();
	public static Stack<Integer> countIncorrect = new Stack<Integer>();
	public static Stack<Integer> countShapes = new Stack<Integer>();
	public static Stack<Integer> wrongShapes = new Stack<Integer>();
	public static Stack<Integer> countMath = new Stack<Integer>();
	public static Stack<Integer> wrongMath = new Stack<Integer>();
	
	public static PriorityQueue<Priority> games = new PriorityQueue<Priority>(3, new The_Comparator());
	
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

		stack.add(finalScore1);

		double total = finalScore1 * 100;
		
		String score1 = Double.toString(total);
		
		Priority g1 = new Priority(score1, "Odd/Evens");
		games.add(g1);

		return score1 + " %";
		//return total;
	}
	public static String totalShape() {

		double incorrect3 = wrongShapes.size();
		double totalPlays3 = wrongShapes.size() + countShapes.size();

		double difference3 = totalPlays3 - incorrect3;
		double finalScore3 = difference3 / totalPlays3;

		//stack.add(finalScore3);

		double total = finalScore3 * 100;
			

		String score3 = Double.toString(total);
		//String score3 = Integer.toString(total);
		
		Priority g2 = new Priority(score3, "Shapes");
		games.add(g2);

		return score3 + " %";
		
		//testing variables
		//String test = Integer.toString(incorrect3);
		//return score3;
		
		//testing
		//its not adding to the array -if statement issue
		//String test = Double.toString(countShapes.size());
		//String test2 = Double.toString(wrongShapes.size());;
		//return test2;
	}

	public static String printQueue() {
		String name ="";
		String score="";
    	while(!Scores.games.isEmpty()) {
			name = (games.poll().getGame());
			score = (games.poll().getScore()); ///error
		}
		//return game + ": " + score;
    	
    	return name +" : " + score;
    	// returns correct format - only first time/doesnt update
    }
	
	public String toString() {
		return games.toString();
		//its only returning the name and not scores
	}
	public static String totalMath() {

		int incorrect = wrongMath.size();

		double totalPlays = countMath.size();
		double difference = totalPlays - incorrect;
		double finalScore1 = difference / totalPlays;

		stack.add(finalScore1);

		double total = finalScore1 * 100;
		
		String score1 = Double.toString(total);
		
		Priority g3 = new Priority(score1, "Math");
		games.add(g3);

		return score1 + " %";
		//return total;
	}

}
