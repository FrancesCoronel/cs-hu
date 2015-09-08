//FVCproductions
//Employee Class

/*

Employee Class

- attributes

	1. eName, eAge, eHoursWorked, eMoneyEarned
	2. defined constants: social security rate (12% of salary), federal income tax rate (25% of salary), pay_rate (15.50 per hour)

- parameter constructor

- no argument constructor

- accessor methods

	1. getName()
	2. getAge()
	3. getMoney() - subtracts 50.00 from eMoneyEarned and returns money changed
	4. getHrsWorked()

- mutator methods
	
	1. setName()
	2. setAge()
	3. setHrsWorked()
	
- calcMoney() method
	
	1. multiply eHours_worked by pay_rate
	2. subtract social security and federal income tax from calculated based salary
	
- social security rate (12% of salary)

- federal income tax rate (25% of salary)

- toString() method

	1. returns conctenation of name, age, money

*/

public class Employee {
	
	//declaring final constants
	public static final double SOCIAL_SECURITY = .12;
	public static final double FEDERAL_INCOME_TAX = .25;
	public static final double PAY_RATE = 15.50;
	
	//defining variables
	private String eName;
	private int eAge, eHoursWorked;
	private double eMoneyEarned;
	
	//creating constructor with defined parameters
	public Employee(String name, int age, int hrs_worked) {
		eName = name;
		eAge = age;
		eHoursWorked = hrs_worked;
	}
	
	//creating no argument constructor
	public Employee() {
		eName = null;
		eAge = 0;
		eHoursWorked = 0;
	}
	
	//defining accessor methods
	public String getName() {
		return eName;
	}
	
	public int getAge() {
		return eAge;
	}
	
	public double getMoney() {
		eMoneyEarned = eMoneyEarned - 50.00;
		return eMoneyEarned;
	}
	
	public int getHrsWorked() {
		return eHoursWorked;
	}
	
	//defining mutator methods
	public void setName(String na) {
		eName = na;
	}
		
	public void setAge(int ag) {
		eAge = ag;
	} 
		
	public void setHrsWorked(int hrs) {
		eHoursWorked = hrs;
	}
	
	//defining calc method for money
	public double calcMoney() {
		eMoneyEarned = eHoursWorked*PAY_RATE;
		eMoneyEarned = eMoneyEarned - SOCIAL_SECURITY*eMoneyEarned - FEDERAL_INCOME_TAX*eMoneyEarned;
		return eMoneyEarned;  
	}
}