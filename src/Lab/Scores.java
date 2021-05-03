package Lab;

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

	SelectionSort ob = new SelectionSort();

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

		return score1;

	}

	public static String totalMath() {

		int incorrect = wrongMath.size();

		double totalPlays = countMath.size();
		double difference = totalPlays - incorrect;
		double finalScore1 = difference / totalPlays;

		double total = finalScore1 * 100;

		stackM.add(total);

		String score1 = Double.toString(total);

		return score1;
	}

	public static String totalShape2() {

		double incorrect = wrongShapes.size();

		double circle = countCircle.size();
		double square = countSquare.size();
		double triangle = countTriangle.size();

		double totalPlays = 3.0;
		double sum = circle + square + triangle;
		double difference = totalPlays - incorrect;
		double finalScore3 = difference / totalPlays;

		double total = finalScore3 * 100;

		stackS.add(total);

		String score3 = Double.toString(total);

		return score3;
	}

	public static String oeStackSum(Stack<Double> stackOE) {
		double sum = 0;
		double avg = 0;
		double size = stackOE.size();
		String aScore = "";
		while (!stackOE.isEmpty()) {
			double n = stackOE.pop();
			sum += n;
			avg = sum / size;
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
			avg = sum / size;
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
			avg = sum / size;
			aScore = Double.toString(avg);
		}
		return aScore;
	}

}
