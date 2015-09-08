/**
 * 'ArrayStack.java' implements a stack by using an array.
 * Uses the starter code for the class provided.
 * Utilizes the DStack interface.
 * @author FVCproductions
 * @version 1.0
 * @since 1-16-15
 * @see DStack.java
 */

/**
 * only class we are allowed to import for this project
 * will throw an error if the stack is empty
 * @see EmptyStackException
 */

import java.util.EmptyStackException;

public class ArrayStack implements DStack
{
	//declaring necessary variables
	private int size;
	private double[] stack;
	private int index;

	/**
	 * ArrayStack constructor creates empty stack with default values
	 */
     public ArrayStack( ) 
     {
           // Your constructor code 
           size = 10;
           stack = new double[size];
           index = -1;
     }

     /**
      * isEmpty method check to see if stack is empty
      * @return true if empty, false otherwise
      */
     public boolean isEmpty( )
     {
           // Your isEmpty( ) code
           if (index == -1)
           {
           	return true;
           }
           return false;
     }

    /**
	 * push method stores a data into a stack 
	 * @param d a double data - from DStack.java
	 * @see DStack.java
	 */
     public void push(double d) 
     {
          // Your push( ) code
          checkSize();
          index++;
          stack[index] = d;
     }

// continue with the rest of the methods,
// along with any fields, etc.

     /**
      * checkSize method checks to see if the stack can store one more value or not.
      * Ergo, it ensures the size of the stack is large enough to store extra values.
      * Will create a new stack that is resized (double).
      * @return nothing if there is enough space
      */
     private void checkSize() 
     {
     	// if there is enough space to store another value,
     	if (index + 2 <= size)
     	{
     		// nothing needs to happen
     		// so return
     		return;
     	}
     	// else, if there is not enough size than size is doubled
     	size *= 2;
     	// copying old values of stack into new one using temporary stack called 'tempStack'
     	double[] tempStack = new double[size];
     	for (int i = 0; i <= index; i++) 
     	{
     		tempStack[i] = stack[i];
     	}
     	stack = tempStack;
     }

    /**
	 * pop method returns last data pushed into stack and removes it
	 * @return last value pushed into stack
	 * @throws EmptyStackException if stack is empty
	 */
	public double pop() {
		if (isEmpty()) 
		{
			throw new EmptyStackException();
		}
		double value = stack[index];
		index--;
		return value;
	}

	/**
	 * peek method returns last value pushed into stack
	 * does not modify stack however
	 * @return last value pushed into stack
	 * @throws EmptyStackException if stack is empty
	 */
	public double peek() {
		if (isEmpty()) 
		{
			throw new EmptyStackException();
		}
		return stack[index];
	}

}
