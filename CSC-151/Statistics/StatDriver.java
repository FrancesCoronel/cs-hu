//FVCproductions
//March 6, 2014

import java.util.Scanner; //import scanner class
import static java.lang.System.out; //import System.out class

public class StatDriver {
	
	public static void main(String[] args) {
	
		int num_1, num_2, num_3, num_4; //defining variables for first four numbers
		
		//creating scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		//getting four numbers from user

		out.println("Hello there! Please enter your first number: ");
		num_1 = keyboard.nextInt();
		
		out.println("Now enter your second number: ");
		num_2 = keyboard.nextInt();
		
		out.println("Now your third number: ");
		num_3 = keyboard.nextInt();
		
		out.println("Finally, your fourth number: ");
		num_4 = keyboard.nextInt();
		
		//creating object for first four numbers

		Statistics obj4Stat = new Statistics(num_1, num_2, num_3, num_4);
		
		//getting two stats pStatB1 and pStatB2 from the user

		int stat_1, stat_2;
		
		out.println();
		
		out.println("Alright now enter your first stat number or pStatB1: ");
		stat_1 = keyboard.nextInt();
		
		out.println("Okay, now enter your second stat number or pStatB2: ");
		stat_2 = keyboard.nextInt();
		
		//creating object for two stat methods

		Statistics obj2Stat = new Statistics(stat_1, stat_2);
		
		//printing out first four numbers

		out.println("Obj4Stat first number: " + obj4Stat.getpStatA1());
		out.println("Obj4Stat second number: " + obj4Stat.getpStatA2());
		out.println("Obj4Stat third number: " + obj4Stat.getpStatA3());
		out.println("Obj4Stat fourth number: " + obj4Stat.getpStatA4());
		
		out.println();
		
		//printing out highest & lowest value of four numbers

		out.println("Highest of the four numbers: " + obj4Stat.getHighest4Stat());
		out.println("Lowest of the four numbers: " + obj4Stat.getLowest4Stat());
		
		out.println();
		
		//printing out 2 stats

		out.println("Obj2Stat first stat/number: " + obj2Stat.getpStatB1());
		out.println("Obj2Stat second stat/number: " + obj2Stat.getpStatB2());
		
		out.println();
		
		//printing out highest & lowest value of the 2 stats

		out.println("Highest of the two numbers/stats: " + obj2Stat.getHighest2Stat());
		out.println("Lowest of the two number/stats: " + obj2Stat.getLowest2Stat());
		
		out.println();
		
		/*
		part II
		*/
		
		int c, z;
		
		//asking user for input
		
		out.println();
		
		out.println("For Part II, enter number c: ");
		c = keyboard.nextInt();
		
		out.println("Enter number z: ");
		z = keyboard.nextInt();
		
		out.println();
		
		//testing if c and z are even
		
		if (c%2 == 0)
			out.println("number c is even");
		else
			out.println("number c is not even");
			
		if (z%2 == 0)
			out.println("number z is even");
		else
			out.println("number z is not even");

		//testing if c and z are odd
		
		if (c%2 != 0)
			out.println("number c is odd");
		else
			out.println("number c is not odd");
			
		if (z%2 != 0)
			out.println("number z is odd");
		else
			out.println("number z is not odd");
		
		//testing if c and z are greater than certain numbers
		
		if (c > 10)
			out.println("c is greater than 10");
		
		if (z > 20)
			out.println("z is greater than 20");
	
	}
}