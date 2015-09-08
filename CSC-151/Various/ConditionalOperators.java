//FVCproductions
//Date: March 27, 2014
//Conditional Operators

public class ConditionalOperators {
	
	public static void main(String[] args) {
	
		int i = -1; //initializing i with -1
		int j; //defining j
		
		j = i < 0 ? 10 : 20; //defining j with conditional operator
		
		System.out.println("The value of j is " + j); //printing j out with conditional operator
		
		//defining j with if-else statement
		if i < 0
			j = 10;
		else
			j = 20;
			
		System.out.println("The value of j is " + j); //printing j out again with if else statment
		
		/* 2nd part */
		
		String car; //defining car with conditional operator
		String light = "Green"; //initializing light with "Green"
		
		car = light.equals("Green") ? "moving" : "stopped"; //defining car with conditional operator
		
		System.out.println("The car is " + car); //printing car out with conditional operator
		
		//defining car with if-else statment
		if light.equals("Green")
			car = "moving";
		else
			car = "stopped";
		
		System.out.println("The car is " + car); //printing car out again with if else statement
				
	}
}