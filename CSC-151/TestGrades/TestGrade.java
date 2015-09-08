//FVCproductions
//March 20, 2014
//TestGrade

import static java.lang.System.out; //importing System.out method

public class TestGrade {

	private int score; //declaring private variables

	public TestGrade (int sc) { //constructor method 
		
		score = sc;

	}

	public void setScore(int sc) { //accessor method for setting score

		score = sc;

	}
	
	public int getScore() { //mutator method for getting score
		
		return score;
	
	}
	
	public String getLetterGrade() { //mutator method for getting letter grade using Nested if else statements
		
	String grade;

	if (score < 60) 
		grade = "F";
	else {
		if (score <= 63) 
			grade = "D-";
		else {
			if (score <= 67) 
				grade = "D";
			else {
				if (score <= 69) 
					grade = "D+";
				else {
					if (score <= 73) 
						grade = "C-";
					else {
						if (score <= 77) 
							grade = "C";
						else {
							if (score <= 79)
								grade = "C+";
							else {
								if (score <= 83)
									grade = "B-";
								else {
									if (score <= 87)
										grade = "B";
									else {
										if (score <= 89)
											grade = "B+";
										else {
											if (score <= 93)
												grade = "A-";
											else {
												if (score <= 97)
													grade = "A";
												else {
													grade = "A+";
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		return grade;
	}


}
													