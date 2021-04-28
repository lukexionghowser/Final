package Lab;

import java.util.Comparator;
import Lab.Priority;

public class The_Comparator implements Comparator<Priority> {

    
	public int compare(Priority p1, Priority p2) {
		String word1 = p1.game;
		String word2 = p2.game;
		char a = word1.charAt(0);
		char b = word2.charAt(0);
		int compareOneTwo = Character.compare(a, b);
		if (compareOneTwo > 0) {
			return 1;
		} else {
			return -1;
			
		}
	}

}
