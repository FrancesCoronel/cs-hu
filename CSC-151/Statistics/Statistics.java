//FVCproductions
//March 6, 2014

public class Statistics {

	//defining private variables
	private int pStatA1, pStatA2, pStatA3, pStatA4, pStatB1, pStatB2; 
	
	//creating constructor for first four variables
	public Statistics(int number1, int number2, int number3, int number4) { 
		pStatA1 = number1;
		pStatA2 = number2;
		pStatA3 = number3;
		pStatA4 = number4;
	}
	
	//creating constructor for other two variables
	public Statistics(int stat1, int stat2) {
		pStatB1 = stat1;
		pStatB2 = stat2;
	}
	
	//creating accessor methods for getpStatA1 through getpStatB2
	public int getpStatA1() {
		return pStatA1;
	}
	
	public int getpStatA2() {
		return pStatA2;
	}
	
	public int getpStatA3() {
		return pStatA3;
	}
	
	public int getpStatA4() {
		return pStatA4;
	}
	
	public int getpStatB1() {
		return pStatB1;
	}
	
	public int getpStatB2() {
		return pStatB2;
	}
	
	//creating calculator methods for getHighest4Stat and getLowest4Stat
	public int getHighest4Stat() {
	
		int highest;
		
		if ((pStatA1 > pStatA2) && (pStatA1 > pStatA3) && (pStatA1 > pStatA4))
			highest = pStatA1;
		else if ((pStatA2 > pStatA1) && (pStatA2 > pStatA3) && (pStatA2 > pStatA4))
			highest = pStatA2;
		else if ((pStatA3 > pStatA1) && (pStatA3 > pStatA2) && (pStatA3 > pStatA4))
			highest = pStatA3;
		else
			highest = pStatA4;
			
		return highest;
	
	}
	
	public int getLowest4Stat() {
	
		int lowest;
		
		if ((pStatA1 < pStatA2) && (pStatA1 < pStatA3) && (pStatA1 < pStatA4))
			lowest = pStatA1;
		else if ((pStatA2 < pStatA1) && (pStatA2 < pStatA3) && (pStatA2 < pStatA4))
			lowest = pStatA2;
		else if ((pStatA3 < pStatA1) && (pStatA3 < pStatA2) && (pStatA3 < pStatA4))
			lowest = pStatA3;
		else
			lowest = pStatA4;
			
		return lowest;
	
	}
	
	//creating calculator methods for getHighest2Stat and getLowest2Stat
	public int getHighest2Stat() {
	
		int highest_stat;
		
		if (pStatB1 > pStatB2)
			highest_stat = pStatB1;
		else
			highest_stat = pStatB2;
		
		return highest_stat;
	
	}
	
	public int getLowest2Stat() {
	
		int lowest_stat;
		
		if (pStatB1 < pStatB2)
			lowest_stat = pStatB1;
		else
			lowest_stat = pStatB2;
		
		return lowest_stat;
	
	}
	
}