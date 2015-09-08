/**
 *   @author FVCproductions
 *   @version 1.0
 *   @since 1-16-15
 *   TO TURN IN
 *   QueueStack.java uses FIFOQueue.java for implementation
 *   @see FIFOQueue.java
*/

/**
 * The FIFOQueue class provides the operations enqueue, dequeue,
 * isEmpty and size and those are the ONLY operations that you can use.
 * importing only class we are allowed to use which is EmptyStackException
 * @see EmptyStackException
 */

import java.util.EmptyStackException;

public class QueueStack implements DStack 
{
   // The queue object
   private FIFOQueue queue;

   // you can add more queue instances here and initialize in the constructor

   /**
    * Constructor. Initialize the instance field
    * Assign new contructor to variable 'queue'
    */
   public QueueStack() 
   {
      queue = new FIFOQueue();
      // initialize extra queue object if necessary
   }

   /**
    * Pushes the value onto the stack represented by this queue. In other
    * words, inserts the element at the front of this queue.
    * 
    * @param double value - value pushed into stack
    */
   @Override
   public void push(double value) 
   {
      // TODO write your push operation here
      // enqueue value into queue
      queue.enqueue(value);
      // if the size of queue is bigger than 1
      if (queue.size() > 1) 
      {
      	// assign 0 to int variable 'i'
        int i = 0;
      	// create double variable 'temp'
        double temp;
      	// while 'i' is smaller than the queue size
        while (i < (queue.size() -1)) 
        {
      		// store value returned by dequeue into 'temp'
          temp = queue.dequeue();
      		// enqueue 'temp' into queue
          queue.enqueue(temp);
      		// increase 'i'
          i++;
      	}
      }
   }

   /**
    * Pops the value from the stack represented by this queue. In other words,
    * removes and returns the first element of this queue.
    * 
    * @return value that at the end of the stack
    */
   @Override
   public double pop() 
   {
      // TODO write your pop operation here
      // if queue is empty (using 'isEmpty' method)
      if (queue.isEmpty()) 
      {
        // throw exception from FIFOQueue
      	throw new EmptyStackException();
      }
      // dequeue operation for queue
      double value = queue.dequeue();
      // return value at end of stack provided by dequeue, not 0.0
      //return 0.0//;
      return value;
   }

   // ////////////////////////////////////////////////////////////////
   // Ignore all the methods below, those are only for testing - Ignored.
   // ////////////////////////////////////////////////////////////////

   /**
    * Check if the queue is empty
    * 
    * @return true if the queue is empty, false otherwise
    */
   @Override
   public boolean isEmpty() 
   {
      return queue.isEmpty();
   }

   /**
    * Peek the last element
    * 
    * @return the last element in the queue object
    */
   @Override
   public double peek() 
   {
      double popVal = pop();
      push(popVal);
      return popVal;
   }
}
