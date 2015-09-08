/**
 * Interface for disjoint sets implementations for ints. 
 * Assumes elements in the set are unique and numbered starting at 0, 
 * ending at numElements-1.  Set names are also in this same range.
 * Throw exceptions as appropriate. 
 */
public interface DisjointSets 
{

    /**
     * Union (combine) two disjoint sets into one set. 
     * No restriction on which set should be added to the other set.
     * @param set1 the name of set 1.
     * @param set2 the name of set 2.
     * @throws InvalidSetNameException if either of set1 or set2 are 
     * not the name of sets.
     */
    public void union(int set1, int set2);

    /**
     * Find which set element x belongs to.
     * @param x the element being searched for.
     * @return the name of the set containing x.
     * @throws InvalidElementException if x is not a valid element. 
     */
    public int find(int x);

    /**
     * Returns the current total number of sets.
     * @return the current number of sets.
     */
    public int numSets();

    /**
     * Determine if an element is the name of a set.
     * @param x an element
     * @return true if x is the name of a set
     * @throws InvalidElementException if x is not a valid element. 
     */
    public boolean isSetName(int x);

    /**
     * Returns the total number of elements in the given set.
     * @param setNum the name of a set
     * @throws InvalidSetNameException if setNum is not the name of a set.
     */
    public int numElements(int setNum);

    /**
     * Prints out the elements in the given set.
     * setNum is assumed to be a root and represents the name of a set.
     * @param setNum the name of a set
     * @throws InvalidSetNameException if setNum is not the name of a set.
     */
    public void printElements(int setNum);

    /**
     * Returns an array containing the elements in the given set.
     * @param setNum the name of a set
     * @returns an array containing the elements in the given set.
     * @throws InvalidSetNameException if setNum is not the name of a set.
     */
    public int [] getElements(int setNum);
}


