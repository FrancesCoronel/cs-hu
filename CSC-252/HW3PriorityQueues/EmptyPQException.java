/*
 * This exception signifies an invalid access on an empty heap.
 */
public class EmptyPQException extends RuntimeException 
{
    // assign a version number for serializable class
    private static final long serialVersionUID = 1L;

    /*
     * Empty constructor
     */
    public EmptyPQException() 
    {
    
    }

    /*
     * Constructor that takes message as parameter
     * 
     * @param message
     *            the error message
     */
    public EmptyPQException(String message) 
    {
        super(message);
    }
}
