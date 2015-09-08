/***************************************************

fvcproductions

july 2012

Person Class

****************************************************/

public class Person {
	
	//define attributes

	protected String name;
	protected int age;
	protected double money;
	
	//constructors

	public Person(String aName, int aAge) {
		name = aName;
		age = aAge;
		money = 0.0;
	}
	
	public Person(String aName, int aAge, double aMoney)
	{
		name = aName;
		age = aAge;
		money = aMoney;
	}
	
	//methods - accessor and mutator

	public String getName() {
		
		return name;
	
	}
	
	public void setName(String newName) { 
		
		name = newName;
	
	}
	
	public int getAge() {
		
		return age;
	
	}

	public double getMoney() {

		return money;
	
	}
	
	public void setMoney(double newMoney) {

		money = newMoney;
	
	}
	
	//toString method
	
	public String toString() {

		String str = name + "\t" + age + "\t" + money;
		return str;
	
	}
	
}