//FVCproductions
//Horoscope App

/*

HoroscopeApp

	1. reads name birthday (month and day) from user using Scanner class
	2. for each user it will create a horoscope object
	3. then it displays intial state of object (horoscope, sign, symbol, element)
	4. calls changeBirthday() method
	5. redisplay name, month, day
	6. redisplay changed state of object (horoscope, sign, symbol, element)

*/


import java.util.Scanner; //importing Scanner method
import static java.lang.System.out; //importing System.out.method

public class HoroscopeApp {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); //importing Scanner object
		
		out.print("Name: "); //getting name from user
		String name = keyboard.nextLine(); 
		
		out.print("Month: "); //getting month from user
		int month = keyboard.nextInt(); 
		
		out.print("Day: "); //getting day from user
		int day = keyboard.nextInt();
		
		Horoscope future = new Horoscope(name, month, day); //creating constructor from class file to work for names that were inputted
      
     	out.println();
		
		out.println("Name: " + future.getName() + " \t" + "Month: " + future.getMonth() + " \t " + "Day: " + future.getDay()); //printing out birthday with name
		
		out.println(future.getName() + ", horoscope says: " + future.getHoroscope()); //printing horoscope string based on birthday along with inputted name
		
		out.println("Sign: " + future.getSign() + " \t " + "Symbol: " + future.getSymbol() + " \t " + "Element: " + future.getElement()); /* printing out sign, symbol, and element */
		
		out.println();
      
       future.changeBirthday(); //changing birthday (decrementing month by 1 and changing day number depending on day)
		
		out.println("Name: " + future.getName() + " \t " + "Month: " + future.getMonth() + " \t " + "Day: " + future.getDay()); /*printing out birthday with name again but with changed bithday */
		
		out.println(future.getName() + ", horoscope says: " + future.getHoroscope()); /*printing horoscope string based on birthday along with inputted name based on new birthday change*/
		
		out.println("Sign: " + future.getSign() + " \t " + "Symbol: " + future.getSymbol() + " \t " + "Element: " + future.getElement()); /* printing out sign, symbol, and element based on new birthday change*/
		
	}
}