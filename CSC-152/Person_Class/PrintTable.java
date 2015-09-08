/***************************************************

fvcproductions

july 2012
 
prints out a table within a new text file of 
all the updated data depending on Person's 
action from a text file

****************************************************/

//importing all necessary classes

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.text.*;

class PrintTable {
	
	public static void main(String[] args) throws IOException { //main method with IOException for file writing
		
		Scanner fileScan = new Scanner(new File("personList.txt")); //creating fileScanner for a file called personList.txt
		PrintWriter out = new PrintWriter("output.txt"); //creating file that all data will be written to
		
		//declaring and initializing all the counter variables for people, working, and shopping, and invalid counts
		
		int noPerson = 0;
		int work_count = 0;
		int shop_count = 0;
		int invalid_count = 0;
		
		//printing out header
		
		out.println("\t\t\t\tMY Company");
		out.println();
		out.println("Name \t\t\tAge \tInitial Money \tAction \t\tFinal Money");
		out.println("---------------------------------------------------------------------------");
		
		//while loop checking if text file has a next line
		
		while (fileScan.hasNext()) {
			
			noPerson += 1; //incrementing number of persons
	
			String personInfo = fileScan.nextLine(); //getting lines from file into Strin personInfo
				
			Scanner personInfoScan = new Scanner(personInfo); //creating personInfoScanner for the personInfo string
			
			personInfoScan.useDelimiter("\t"); //tab delimiter
			
			//grabbing data from personInfoScan for fName and lName
			
			String fName = personInfoScan.next();
			String lName = personInfoScan.next();
			
			//grabbing data from personInfoScan for aAge
			
			int aAge = personInfoScan.nextInt();
			
			//grabbing data from personInfoScan for aMethod
			
			char aMethod = personInfoScan.next().charAt(0);
			
			//declaring and initializing aValue31 - aValue3
			
			double aValue1 = 0, aValue2 = 0, aValue3 = 0; 
			
			//grabbing data from personInfoScan for aValue1 - aValue 3 using personInfoScan
			
			if (personInfoScan.hasNext()) {
				aValue1 = personInfoScan.nextDouble();
			}
			
			if (personInfoScan.hasNext()) {
				aValue2 = personInfoScan.nextDouble();
			}
			
			if (personInfoScan.hasNext()) {
				aValue3 = personInfoScan.nextDouble();
			}
			
			Person aPerson = new Person(fName, lName, aAge); //creating aPerson object of Person class
												
			Random rand = new Random(); //creating Random generator for initial money
						
			aPerson.setMoney(rand.nextDouble()*100); //generating random double value for initial money
			
			out.print(aPerson.toString()); //printing out first name, last name, and age into one string using toString method
			
			if(aMethod == 'W') { //checking if aMethod is for working
				
				if (aValue1 >= 0.01 && aValue2 == 0 && aValue3 == 0) { //checking if aValue1 is only value present
					aPerson.work(aValue1); //calling work for 1 value (earnAmt)
					out.print("\t\tWORK + " + aValue1); //printing out specific statment for aValue1 being only value
					work_count++; //incrementing work_count
				}
				
				else if(aValue2 >= 0.01 && aValue3 >= 0.01) {
					aPerson.work((int)aValue1, aValue2, aValue3); //calling work for 3 values (hours, rate, overtime rate)
					out.print("\t\tWORK " + (int)aValue1 + " * " + aValue2); //printing out specific statment for when there are three different values
					work_count++; //incrementing work_count
				}
			}
							
			else if(aMethod == 'S') { //else checking if aMethod is for shopping
				
				if (aValue1 >= 0.01) {
					aPerson.shop(aValue1); //calling shop for 1 value
					out.print("\t\tSHOP - " + aValue1); //printing SHOP statment for 1 value in parameters
					shop_count++; //incrementing shop_count
				}	
					
				
				else if (aValue1 == 0){
					aPerson.shop(); //just calling shop in general
					out.print("\t\tSHOP\t"); //printing SHOP statment for no values in parameters
					shop_count++; //incrementing shop_count
				}	
			}
							
			else { //checking if aMethod is not for shopping or working
				out.print("\t\tNO ACTION"); //printing NO ACTION since its neither W or S
				invalid_count++; //incrementing invalid_count
			}
			
			DecimalFormat f = new DecimalFormat("##.00"); //creating decimal format for final money value
			
			//checking if there was enough money and then printing appropriate printing statement
			
			if(aValue1 <= aPerson.getMoney()) { 
				out.println("\t" + f.format(aPerson.getMoney())); //enough money final money statment
			}
			else if (aValue1 >= aPerson.getMoney()){
				out.println("\t" + f.format(aPerson.getMoney()) + " //not enough money"); //not enough money final money statement
			}
			
		}
		
		//printing out footer
		
		out.println("---------------------------------------------------------------------------");
		out.println("There are " + noPerson + " persons on the list: " + work_count + " works, " + shop_count + " shops, and " + invalid_count + " invalid-action code.");
		out.println();
		out.println("End - MY Company");
		
		out.close(); //closing output text file
		
	}
}