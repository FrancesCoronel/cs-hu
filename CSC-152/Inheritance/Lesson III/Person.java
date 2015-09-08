/***************************************************

fvcproductions

july 2012
 
calculates various options depending on data 
for each person listed in a text file

****************************************************/

import java.text.*; //importing necessary class for DecimalFormat for money variable

public class Person {
	
	//defining private variables 
	
	private String firstName;
	private String lastName;
	private int age;
	private double money;
	
	//creating Person constructor with 4 variables: full name, age, and money
	
	public Person(String fName, String lName, int aAge, double aMoney) {
		
		firstName = fName;
		lastName = lName;
		age = aAge;
		money = aMoney;
	
	}
	
	//creating Person cosntructor with only 3 variables : full name and age
	public Person(String fName, String lName, int aAge) {
		
		firstName = fName;
		lastName = lName;
		age = aAge;
	
	}
	
	//accessor methods for name
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName; 
	}
	
	//accessor methods for age and money
	public int getAge() {
		return age;
	}
	
	public double getMoney() {
		return money;
	}
	
	//mutator methods for names
	
	public void setFirstName(String newName) {
		firstName = newName;
	}
			
	public void setLastName(String newName) {
		lastName = newName;
	}
	
	//mutator methods for age and money

	public void setAge(int newAge) {
		age = newAge;
	}
			
	public void setMoney(double newMoney) {
		money = newMoney;
	}	
	
	//accessor method for full name
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	//mutator method for work with 1 value in parameter
	
	public void work(double earnAmt) {
		money += earnAmt;
	}
	
	//mutator method for work with 3 values in parameter
	
	public void work(int hours, double rate, double overtimeRate) {
		double wage = hours*rate;
		if (hours > 40) {
			int difference = hours - 40;
			wage += difference*overtimeRate;
		}
	}
	
	//mutator method for shop with no values in parameter
	
	public void shop() {
		if (money >= 10) 
			money -= 10;
	}
	
	//mutator method for shop with 1 value in parameter

	public void shop(double spentAmt) {
		if (money >= spentAmt)
			money -= spentAmt;
	}
	
	//accessor method for toString which returns all attributes (full name, age, $$$)
	
	public String toString() {
		DecimalFormat f = new DecimalFormat("##.0");
		String str = firstName + " " + lastName + "\t\t" + age + "\t" + f.format(getMoney()) + "\t\t";
		return str;
	}
	 
}
