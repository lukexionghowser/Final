package Lab;

public class Priority {
	
	public String score; 
    public String game; 
          
    //  constructor 
    public Priority(String score2, String game) { 
      
        this.score = score2; 
        this.game = game; 
    } 
      
    public String getScore() { 
        return score; 
    }
    
    public String getGame() { 
        return game; 
    }

    public String printQueue() {
    	while(!Scores.games.isEmpty()) {
			Priority print = (Scores.games.poll());
		}
		return game + ": " + score;
    }
    
    public String toString() {
		return game.toString();
	}

}
