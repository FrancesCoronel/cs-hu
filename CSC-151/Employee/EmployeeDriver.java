//FVCproductions
//driver for Employee class

/* 
EmployeeDriver

	1. Read 3 input from user (name, age, hours worked) -- Name, Age, and Hours Worked
	2. instantiate object of Employee class using own name, age, hours
	3. instantiate second object with no arguments
	4. set values for second object using appropriate methods
	5. print state of both objects using toString()
	6. change value of age for each object
	7. call getMoney() for each object
	8. print state of both objects
	9. call calcMoney() for each object
	10. print state of both objects

*/

import java.util.Scanner; //importing Scanner 
import static java.lang.System.out; //importing System.out

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		//creating scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		//asking for input from user and defining them into variables

		out.print("Hello, please enter your name: ");
		String my_name = keyboard.nextLine();
		
		out.println();
		
		out.print("Now enter your age: ");
		int my_age = keyboard.nextInt();
		
		out.println();
		
		out.print("Now enter the number of hours worked: ");
		int my_hours_worked = keyboard.nextInt();
		
		//creating object for Employee A using inputted variables

		Employee aEmployeeA = new Employee(my_name, my_age, my_hours_worked);
		
		//creating no parameter object for Employee B

		Employee aEmployeeB = new Employee();
		
		//setting variables for Employee B

		aEmployeeB.setName("Damien");
		aEmployeeB.setAge(19);
		aEmployeeB.setHrsWorked(30);
		
		out.println();
		
		//printing on screen state of both Employee objects -- 1st time

		out.println("Employee A Name: " + aEmployeeA.getName());
		out.println("Employee A Age: " + Integer.toString(aEmployeeA.getAge()));
		out.println("Employee A Hours Worked: " + Integer.toString(aEmployeeA.getHrsWorked()));
		out.println("Employee A Money: " + Double.toString(aEmployeeA.getMoney()));
		
		out.println();
		
		out.println("Employee B Name: " + aEmployeeB.getName());
		out.println("Employee B Age: " + Integer.toString(aEmployeeB.getAge()));
		out.println("Employee B Hours Worked: " + Integer.toString(aEmployeeB.getHrsWorked()));
		out.println("Employee B Money: " + Double.toString(aEmployeeB.getMoney()));
		
		//for each Employee object, used setter method to change value of Age
		aEmployeeA.setAge(30);
		aEmployeeB.setAge(31);
		
		out.println();
		
		//for each employee, call the getMoney method
		//also printed out appropriate message although that was not asked for
		//printed message is for clarity

		out.println("Employee A calling getMoney method: " + aEmployeeA.getMoney());
		out.println("Employee B calling getMoney method: " + aEmployeeB.getMoney());
		
		out.println();
		
		//print the final state of both objects -- 2nd time

		out.println("Employee A Name: " + aEmployeeA.getName());
		out.println("Employee A Age: " + Integer.toString(aEmployeeA.getAge()));
		out.println("Employee A Hours Worked: " + Integer.toString(aEmployeeA.getHrsWorked()));
		out.println("Employee A Money: " + Double.toString(aEmployeeA.getMoney()));
			
		out.println();
			
		out.println("Employee B Name: " + aEmployeeB.getName());
		out.println("Employee B Age: " + Integer.toString(aEmployeeB.getAge()));
		out.println("Employee B Hours Worked: " + Integer.toString(aEmployeeB.getHrsWorked()));
		out.println("Employee B Money: " + Double.toString(aEmployeeB.getMoney()));
		
		//for each Employee object call the calcMoney Method

		aEmployeeA.calcMoney();
		aEmployeeB.calcMoney();
		
		out.println();
		
		//printing the final state of both objects -- 3rd time
		
		out.println("Employee A Name: " + aEmployeeA.getName());
		out.println("Employee A Age: " + Integer.toString(aEmployeeA.getAge()));
		out.println("Employee A Hours Worked: " + Integer.toString(aEmployeeA.getHrsWorked()));
		out.println("Employee A Money: " + Double.toString(aEmployeeA.getMoney()));
			
		out.println();
		
		out.println("Employee B Name: " + aEmployeeB.getName());
		out.println("Employee B Age: " + Integer.toString(aEmployeeB.getAge()));
		out.println("Employee B Hours Worked: " + Integer.toString(aEmployeeB.getHrsWorked()));
		out.println("Employee B Money: " + Double.toString(aEmployeeB.getMoney()));

	}
}