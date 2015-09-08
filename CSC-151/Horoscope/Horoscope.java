//FVCproductions
//The Horoscope Class

/*

Horoscope Class

- 3 instance data
	1. name
	2. month
	3. day
- methods
	1. getName()
	2. getMonth()
	3. getDay()
	4. getSign()
	5. getElement()
	6. getHoroscope()
	7. setDay()
	8. setMonth()
	9. changeBirthday()
- changeBirthday()
	- this method should decrement your month by 1 and your day by 5
	- if day <= 5, increment day by 5
	
*/

public class Horoscope {
		
		//defining variables privately
		private String name, sign, element, symbol, horoscope;
		private int month, day;
		
		public Horoscope(String nam, int mont, int da) { //constructor needed for the driver program
			
			name = nam;
			month = mont;
			day = da;
			
		}
		
		//accessor methods
		
		public String getName() { //calling name
			return name;
		}
		
		public int getMonth() { //calling month
			return month;
		}
		
		public int getDay() { //calling day
			return day;
		}
		
		/* 
		I realize I am using more methods than necessary or requested, 
		however, it does allow for more customization later on 
		if someone else wanted to change the values for the data for each zodiac sign 
		*/
		
		public String getSign() { //method to call zodiac sign based on month and day 
			
			/* 
			dates for zodiac sign taken from dailyhoroscopes.com
		
			30 days hath September, 
				April, June and November,
			All the rest have 31,
				Excepting February alone
			And that has 28 days clear,
				With 29 in each leap year.
			*/
			
			if      ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 19))
				sign = "Capricorn";
			else if ((month ==  1 && day >= 20 && day <= 31) || (month == 2 && day >= 1 && day <= 18))
				sign = "Aquarius";
			else if ((month ==  2 && day >= 19 && day <= 29) || (month == 3 && day >= 1 && day <= 20))
				sign = "Pisces";
			else if ((month ==  3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 19))
				sign = "Aries";
			else if ((month ==  4 && day >= 20 && day <= 30) || (month == 5 && day >= 1 && day <= 20))
				sign = "Taurus";
			else if ((month ==  5 && day >= 21 && day <= 31) || (month == 6 && day >= 1 && day <= 21))
				sign = "Gemini";
			else if ((month ==  6 && day >= 22 && day <= 30) || (month == 7 && day >= 1 && day <= 22))
				sign = "Cancer";
			else if ((month ==  7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22))
				sign = "Leo";
			else if ((month ==  8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22))
				sign = "Virgo";
			else if ((month ==  9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 23))
				sign = "Libra";
			else if ((month == 10 && day >= 24 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
				sign = "Scorpio";
			else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
				sign = "Sagittarius";
			else
				System.out.println("Oops, wrong date! Try again.");
			return sign;
		
		}
		
		public String getSymbol() { //method to call symbol for zodiac sign
			
			if (sign == "Capricorn")
				symbol = "Goat";
			else if (sign == "Aquarius")
				symbol = "Water Bearer";
			else if (sign == "Pisces")
				symbol = "Fish";
			else if (sign == "Aries")
				symbol = "Ram";
			else if (sign == "Taurus")
				symbol = "Bull";
			else if (sign == "Gemini")
				symbol = "Twins";
			else if (sign == "Cancer")
				symbol = "Crab";
			else if (sign == "Leo")
				symbol = "Lion";
			else if (sign == "Virgo")
				symbol = "Virgin";
			else if (sign == "Libra")
				symbol = "Scales";
			else if (sign == "Scorpio")
				symbol = "Scorpion";
			else if (sign == "Sagittarius")
				symbol = "Archer";
			else
				System.out.println("Oops, wrong symbol! Try again.");
					
			return symbol;
		}
		
		public String getElement() { //method to call element for zodiac sign
			
			if (sign == "Leo" || sign == "Aries" || sign == "Sagittarius")
				element = "Fire";
			else if (sign == "Aquarius" || sign == "Libra" || sign == "Gemini")
				element = "Air";
			else if (sign == "Cancer" || sign == "Scorpio" || sign == "Pisces")
				element = "Water";
			else if (sign == "Taurus" || sign == "Virgo" || sign == "Capricorn")
				element = "Earth";
			else
				System.out.println("Oops, wrong element! Try again.");
			
			return element;
		}
		
		public String getHoroscope() {
			
			getSign(); //found out the hard way that this is necessary since one method is dependent on another - rather fascinating really!
						
			if (sign.equals("Capricorn"))
				horoscope = "Fun and despair will be in the air today when a nearby confetti factory detonates, resulting in the death of 67 employees.";
			else if (sign.equals("Aquarius"))
				horoscope = "A darn happy time for you in general today, that is until you complete 100 steps getting out of bed. Then it will all go downhill.";
			else if (sign.equals("Pisces"))
				horoscope = "Things are starting to get fishy ever since your plot to murder the annoying guy in your lecture goes down the pan. You've come to realise you've never actually been in a fight.";
			else if (sign.equals("Aries"))
				horoscope = "Get over it Aries, insanity is in our nature. Even on a planetary scale, we're a crazy bunch. It is your destiny to try and balance this inescapable perplexity of existence that flows through all of us Aries.";
			else if (sign.equals("Taurus"))
				horoscope = "Someone used your passport to steal a Malaysian airplane and now you're the number one suspect. You're on every no-fly list, and even worse, they've barred you from the Union.";
			else if (sign.equals("Gemini"))
				horoscope = "The stakes will be raised this Thursday, moments before they are repeatedly plunged into your chest by angry countryfolk that suspect you of being a pagan.";
			else if (sign.equals("Cancer"))
				horoscope = "Looking up your horoscope will not aid in the completion of your homework. Try seeking guidance from a higher power (Vishnu, Jesus, Zeus, your professor).";
			else if (sign.equals("Leo"))
				horoscope = "Today is not your day. Hang your jacket at your desk, turn on your hood lights, and head on back home like a good old Joe.";
			else if (sign.equals("Virgo"))
				horoscope = "It's possible that today a break from your normal routine might occur. Even the tiniest deviation from routine today proves this to be correct.";
			else if (sign.equals("Libra"))
				horoscope = "The breathing of oxygen will occur today in your travels.";
			else if (sign.equals("Scorpio"))
				horoscope = "Today your whole life wil flash before your eyes, an insignificant blip made all the more trivial by the Batman theme that will accompany it.";
			else if (sign.equals("Sagittarius"))
				horoscope = "Today might be a good time to set your priorities straight and just do what needs to be done.";
			else
				System.out.println("Oops, wrong horoscope! Try again.");
			
			return horoscope;
		}
		
		//mutator methods
		
		public void setDay(int theDay) { //setting the day 
			day = theDay;
		}
		
		public void setMonth(int theMonth) { //setting the month
			month = theMonth;
		}
		
		public int changeBirthday() {
			
			month--; //decrementing by 1
			
			/*
			to note:
			month cannot be decremend by 1 if month is already 1 (January)
         	*/
			
			if (day <= 5) 
				day += 5;
			else
				day -= 5;
				
			/*
			if day is less than or equal to 5
				increment day by 5
			else 
				decrement by 5
			*/
         
         return day; //apparently not necessary to return month and day  - fancy that!
      }	
}