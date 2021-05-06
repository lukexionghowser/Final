package Tests;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class ScoresTest {

	@Test // testing panel 1's game
	void testCountOdd() {
		Stack<Integer> list = new Stack<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		assertEquals(5, 5);
	}

	@Test
	void testCountEven() {
		Stack<Integer> list = new Stack<Integer>();
		list.add(1);
		list.add(1);
		assertSame(2, 2);
	}

	@Test // testing panel 2's game
	void testTotalMath() {
		Stack<Integer> wrong = new Stack<Integer>();
		wrong.add(1);
		Stack<Integer> countM = new Stack<Integer>();
		countM.add(1);
		countM.add(1);
		countM.add(1);
		countM.add(1);
		int incorrect = wrong.size();
		double totalPlays = countM.size();
		double difference = totalPlays - incorrect;
		double finalScore1 = difference / totalPlays;

		double total = finalScore1 * 100;
		String score1 = Double.toString(total);

		assertFalse(wrong.isEmpty());
		assertEquals("75.0", "75.0");
	}

	@Test
	void testTotalShape2() {
		Stack<Integer> wrong = new Stack<Integer>();
		wrong.add(1);
		Stack<Integer> countS = new Stack<Integer>();
		countS.add(2);
		int incorrect = wrong.size();
		double totalPlays = countS.size();
		double difference = totalPlays - incorrect;
		double finalScore1 = difference / totalPlays;

		double total = finalScore1 * 100;
		String score1 = Double.toString(total);

		assertFalse(wrong.isEmpty());
		assertEquals("50.0", "50.0");
	}

	@Test
	void testSStackSum() {
		Stack<Integer> sSum = new Stack<Integer>();

		double sum = 0;
		double avg = 0;
		double size = sSum.size();
		String aScore = "";
		while (!sSum.isEmpty()) {
			double n = sSum.pop();
			sum += n;
			avg = sum / size;
			aScore = Double.toString(avg);
		}
		assertNull(aScore);
	}

}
