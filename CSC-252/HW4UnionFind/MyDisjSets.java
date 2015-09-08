/**
 * @see  DisjointSets.java
 * @author  FVCproductions
 * @version  1.0
 * @since  March 9, 2015
 * MyDisjSets
 * - implementation of disjoint sets
 * - uses classic union-find algorithm to manage set of integers
 */

public class MyDisjSets implements DisjointSets 
{
	
	private int[] sets;
	private int numSets;

	/**
	 * MyDisjSets constructor [creates MyDisjSets object]
	 * @param numElements [total number of elements, each element is initially in its own set]
	 * @throws new IllegalArgumentException [if numElements is less than 1]
	 */
	public MyDisjSets(int numElements) 
	{
		if (numElements < 1) 
		{
			throw new IllegalArgumentException("The number of elements - " + numElements + " - is out of range. The number of elements must be greater than 0.");
		}
		numSets = numElements;
		sets = new int[numElements];
		for (int i = 0; i < sets.length; i++) 
		{
			sets[i] -= 1;
		}
	}
	
    /**
     * union method [combines 2 disjoint sets into one set]
     * if set1 is larger or equal to set2, set2 is combined with set1
     * else if set2 is larger, set1 is combined with set2
     * number of sets decreased by 1 after union
     * @param set1 [first set]
     * @param set2 [second set]
     * @throws InvalidSetNameException [if set1 or set2 not name of sets]
     * @throws InvalidElementException [if set1 or set2 does not have valid element)
     */
	public void union(int set1, int set2) 
	{
		checkElement(set1);
		checkElement(set2);
		checkName(set1);
		checkName(set2);
		if (sets[set1] <= sets[set2]) 
		{ 
			sets[set1] += sets[set2];
			sets[set2] = set1; 
		} 
		else 
		{ 
			sets[set2] += sets[set1];
			sets[set1] = set2;
		}
		numSets--;
	}	

    /**
     * [checks which set element belongs to]
     * @param x [element being searched for]
     * @return [name of set containing x]
     * @throws InvalidElementException [if x not valid element]
     */
	public int find(int x) 
	{
		checkElement(x);
		if(sets[x] < 0) 
		{
			return x;
		} 
		else 
		{
			sets[x] = find(sets[x]);
			return sets[x];
		}
	}
	
    /**
     * [returns current total number of sets]
     * @return current number of sets
     */
	public int numSets() 
	{
		return numSets;
	}
	
    /**
     * [checks if element is name of set]
     * @param x [element being checked]
     * @return true [if x is name of set]
     * @throws InvalidElementException [if x not a valid element] 
     */
	public boolean isSetName(int x) 
	{
		checkElement(x);
		return sets[x] < 0;
	}

    /**
     * [returns total number of elements in set]
     * @param setNum [name of set]
	 * @throws InvalidSetNameException [if setNum not name of a set]
	 * @throws InvalidElementException [if setNum not valid element] 
     */
	public int numElements(int setNum) 
	{
		checkElement(setNum);
		checkName(setNum);		
		return Math.abs(sets[setNum]);
	}
	
    /**
     * [prints element out of given set]
     * iterates through array to print each element out
     * @param setNum [name of set]
	 * @throws InvalidSetNameException [if setNum not name of a set]
	 * @throws InvalidElementException [if setNum not valid element] 
     */
	public void printElements(int setNum) 
	{		
		int[] arr = getElements(setNum);
		System.out.print("{");
		System.out.print(arr[0]);
		for(int i = 1; i < arr.length; i++) 
		{
			System.out.print(", " + arr[i]);
		}
		System.out.print("}");	
	}

	/**
	 * [returns array with elements of set]
	 * creates array to store all elements of set
	 * iterates over set and inserts each element of set into array
	 * @param setNum [the name of a set]
	 * @return array with elements of set
	 * @throws InvalidSetNameException [if setNum not name of a set]
	 * @throws InvalidElementException [if setNum not valid element]
	 */
	public int[] getElements(int setNum) 
	{
		checkElement(setNum);
		checkName(setNum);
		int[] result = new int[Math.abs(sets[setNum])];
		int count = 0;
		for (int i = 0; i < sets.length; i++) 
		{
			if (find(i) ==  setNum) 
			{
				result[count] = i;
				count++;
			}
		}
		return result;
	}
	
	/**
	 * [checks if element is valid by testing InvalidElementException]
	 * @param x [element being checked]
	 * @exception InvalidElementException [if element not valid]
	 * @see  InvalidELementException.java
	 */
	private void checkElement(int x) 
	{
		if (x < 0 || x > sets.length - 1) 
		{
			throw new InvalidElementException("Element " + x + " is out of range. Element must be greater than 0 and less than " + sets.length + ".");
		}
	}
	
	/**
	 * [checks if name of set is valid by testing InvalidSetNameException]
	 * @param x [element being checked]
	 * @exception InvalidSetNameException [if name not valid]
	 * @see  InvalidSetNameException.java
	 */
	private void checkName(int x) 
	{
		if (!isSetName(x)) 
		{
			throw new InvalidSetNameException(x + " - not valid set name.");
		}
	}

}