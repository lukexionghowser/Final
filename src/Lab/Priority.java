package Lab;

import java.security.KeyStore.Entry;

public class Priority {
	
	public static String score; 
    public static String game; 
          
    //  constructor 
    public Priority(String score2, String game) { 
      
        this.score = score2; 
        this.game = game; 
    } 
      
    public static String getScore() { 
        return score; 
    }
    
    public static String getGame() { 
        return game; 
    }
    
    public int compareTo(Entry other) {
    	return this.getGame().compareTo(((Priority) other).getGame());
    }

    public static String printQueue() {
    	//String print2 = "";
    	//String print3 = "";
    	//String score = "";
    	//String game = "";
    	Scores.avgScores();
    	while(!Scores.games.isEmpty()) {
    		// only displaying Shape : (Score)
			Priority print1 = (Scores.games.poll());
			//Priority print2 = (Scores.games.poll());
			//Priority print3 = (Scores.games.poll());
			//score = getScore(); //changed to static
			//game = getGame(); //changed to static
			//print2 = (Scores.games.poll().getGame());
			//print3 = (Scores.games.poll().getScore());
			
		}
		return game + " : " + score;
    }
    
    public String toString() {
		return game.toString();
	}

}
