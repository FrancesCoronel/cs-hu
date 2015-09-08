/*
 * Interface for a stack of primitive doubles.
 * 
 * NOTE: The comments for this interface are horrible! You will
 *       need to write something better for your implementations.
 */

public interface DStack 
{
    /** 
     * is empty?
     */
    public boolean isEmpty();

    /**
     * push
     */
    public void push(double d);

    /**
     * pop
     * @return the deleted value
     * @throws EmptyStackException if stack is empty
     */
    public double pop();

    /**
     * peek
     * @throws EmptyStackException if stack is empty
     */
    public double peek();
}
