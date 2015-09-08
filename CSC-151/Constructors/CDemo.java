//FVCproductions
//Date: February 20, 2014

//importing scanner
import java.util.Scanner;

public class CDemo {

	//defining attributes
	String student;
	String course;
	
	public static void main (String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("User name please: ");
		String student = keyboard.nextLine();
	
		System.out.println("Course name please: ");
		String course = keyboard.nextLine();
	
		//creating new object
		Constructor midterm = new Constructor(student,course);
	
		System.out.println();
		//calling midgrade twice
		midterm.calcMidGrade();
		System.out.println("Midgrade is: " + midterm.calcMidGrade());

		midterm.calcMidGrade();
		System.out.println("Midgrade is: " + midterm.calcMidGrade());
	
		System.out.println();
		
		//printing out user name, course name and midterm grade
		System.out.println("User name: " + midterm.getStname());
		System.out.println("Course name: " + midterm.getCrseName());
		System.out.println("Midterm Grade: " + midterm.calcMidGrade());
	
		System.out.println();
		
		//getting length of string... twice
		String vacation = "CruiseDestination";
		int vacay_len = vacation.length();
		System.out.println("String length of 'vacation': " + vacay_len);
	
		String Tropical = "TropicalIsland";
		int tropic_len = Tropical.length();
		System.out.println("String length of 'tropical': " + tropic_len);
		
		//defining 4 switches
		String switch1, switch2, switch3, switch4;
		
		System.out.println();
		
		//uppercase
		switch1 = Tropical.toUpperCase();
		
		System.out.println("Upper case of Tropical: " + switch1);
		

		//replacing
		switch2 = Tropical.replace('l', '%');

		System.out.println("Switch 1 again: " + switch1);
		System.out.println();
		System.out.println("Replacing characters: " + switch2);
		
		System.out.println();
		
		//printing out certain character
		System.out.println("First character of Tropical: " + switch1.charAt(0));
		System.out.println();
		
		//concatenation
		switch3 = Tropical.concat(vacation);

		System.out.println("Concatenation: " + switch3);
		System.out.println();
		
		//getting location of character
		System.out.println("Location 2 Character of Switch 3: " + switch3.charAt(2));
		System.out.println();
	
		//finding index of character
		System.out.println("Index at 1st occurence of 'o': " + Tropical.indexOf('o'));
		System.out.println();
		
		//getting susbtring of string
		switch4 = Tropical.substring(0,8);

		System.out.println("Substring of tropical: " + switch4);
		
		
		//extra constructor
		Constructor midterm2 = new Constructor();
		
		midterm2.setStname("RotRos");
		midterm2.setCrseName("Python");
		
		System.out.println("User name: " + midterm2.getStname());
		System.out.println("Course name: " + midterm2.getCrseName());
		System.out.println("Midterm Grade: " + midterm2.calcMidGrade());;
	
	}
}	
	
	
	
	
	