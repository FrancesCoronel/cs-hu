//FVCproductions
//March 20, 2014

import static java.lang.System.out; //importing System.out method

public class TestGrade2 {

	private int score; //declaring private variables

	public TestGrade2 (int sc) { //creating constructor
		
		score = sc;

	}

	public void setScore(int sc) { //accessor method for setting score

		score = sc;

	}
	
	public int getScore() { //mutator method for getting score
		
		return score;
	
	}
	
	public String getLetterGrade(){ //using if else if statements to get Letter Grade in mutator method
	
		String grade;
	
		if (score < 60) 
			grade = "F";
		else if (score <= 63)
			grade = "D-";
		else if (score <= 67)
			grade = "D";
		else if (score <= 69)
			grade = "D+";
		else if (score <= 73)
			grade = "C-";
		else if (score <= 77)
			grade = "C";
		else if (score <= 79)
			grade = "C+";
		else if (score <= 83)
			grade = "B-";
		else if (score <= 87)
			grade = "B";
		else if (score <= 89)
			grade = "B+";
		else if (score <= 93)
			grade = "A-";
		else if (score <= 97)
			grade = "A";
		else
			grade = "A+";
			
		return grade;
	
	}
}