/***************************************************

fvcproductions

july 2012
 
manages a list of the Person class using array 
classes with the subclasses Student and Faculty 
to assign values to each student's info

****************************************************/

import java.util.Scanner;
import java.util.Random;

import java.util.ArrayList;

public class theManager {
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("Initial Money");
		System.out.println("Name\t\t\tAge\tMoney\t\tAdditional Info");
		System.out.println("---------------------------------------------------------------------------");
		
		ArrayList<Person> PersonList = new ArrayList<Person>();
		
		//1 Person - Me
		Person violet = new Person("Violet", "Siegius", 18, 50); 
		
		//1st Student
		Student rosi = new Student("Rosi", "Siegius", 16, 40); 
		
		//2nd Student
	 	Student jiaqi = new Student("Jiaqi", "Song", 19, 30, "International Logistics", 0); 
		
		//1st Faculty Member
		Faculty math_teacher = new Faculty("Larry", "Walker", 45, 80);
		
		//2nd Faculty Member
		Faculty cs_teacher = new Faculty("Lydia", "Brown", 35, 70, "Instructor", "Computer Science");
		
		PersonList.add(violet);
		PersonList.add(rosi);
		PersonList.add(jiaqi);
		PersonList.add(math_teacher);
		PersonList.add(cs_teacher);
		
		Random generator = new Random(); //creating Random generator for initial money
				
		double randValue = 0;
				
		for (int i = 0; i < PersonList.size(); i++){
			
			System.out.print(PersonList.get(i));
			
			randValue = generator.nextDouble();
			
			if (randValue < .5) {
					
				int workValue = 0;
				workValue = generator.nextInt(50)+50;
				
				double newWMoney = PersonList.get(i).getMoney();
				newWMoney += workValue;
				PersonList.get(i).setMoney(newWMoney);
				
				System.out.println("[[W + " + workValue + " ]]");
			}
			
			else if (randValue > .5) {
				
				int shopValue = 0;
				shopValue = generator.nextInt(10)+20;
				
				double newSMoney = PersonList.get(i).getMoney();
				newSMoney -= shopValue;
				PersonList.get(i).setMoney(newSMoney);
				
				System.out.println("[[S - " + shopValue + " ]]");
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Final Money");
		System.out.println("Name\t\t\tAge\tMoney\t\tAdditional Info");
		System.out.println("---------------------------------------------------------------------------");
		
		for (int j = 0; j < PersonList.size(); j++)
			System.out.println(PersonList.get(j));
		
	}
}


/* ---OUTPUT---

    Initial Money
    Name			Age	Money		Additional Info
    ---------------------------------------------------------------------------
    Violet Siegius		18	50.0		[[W + 86 ]]
    S: Rosi Siegius		16	40.0		n/a	[[S - 28 ]]
    S: Jiaqi Song		19	30.0		International Logistics	[[W + 87 ]]
    F: Larry Walker		45	80.0		n/a	[[W + 64 ]]
    F: Lydia Brown		35	70.0		Computer Science, Instructor	[[S - 25 ]]
    
    
    Final Money
    Name			Age	Money		Additional Info
    ---------------------------------------------------------------------------
    Violet Siegius		18	136.0		
    S: Rosi Siegius		16	12.0		n/a	
    S: Jiaqi Song		19	117.0		International Logistics	
    F: Larry Walker		45	144.0		n/a	
    F: Lydia Brown		35	45.0		Computer Science, Instructor	
    
*/
