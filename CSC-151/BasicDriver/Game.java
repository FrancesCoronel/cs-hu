//FVCproductions
//Date: February 13, 2014

public class Game 
{

// declaring private variables

	private String playerName;
	private int expLevel;
	private double score;

// accessor method for player name		
	public String getPlayerName() 
	{
		return playerName;
	}

// mutator method for player name

	public void setPlayerName(String n) 
	{
		playerName = n;
	}
	
// accessor method for exp level
		
	public int getExpLevel() 
	{
		return expLevel;
	}

// mutator method for exp level

	public void setExpLevel(int e) 
	{
		expLevel = e;
	}	

// accessor method for calc score

	public double calcScore() 
	{
		score = score*5 - 2;
		return score;
	}

// mutator method for calc score

	public void setScore(double sc)
	{
		score = sc;
	}

}