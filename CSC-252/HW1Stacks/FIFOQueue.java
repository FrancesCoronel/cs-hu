import java.util.ArrayDeque;

/**
 * Queue object for a stack of primitive doubles.
 * 
 * @version CSE252 Spring 2015
 * 
 *          NOTE: The comments for this interface are horrible! You will need to
 *          write something better for your implementations.
 */
public class FIFOQueue extends ArrayDeque<Double> {
    // assign a version number for serializable class
    private static final long serialVersionUID = 1L;

    /**
     * Is empty?
     */
    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    /**
     * Size
     */
    @Override
    public int size() {
        return super.size();
    }

    /**
     * Enqueue
     */
    public void enqueue(double value) {
        super.add(value);
    }

    /**
     * Dequeue
     * 
     * @return the deleted value
     */
    public double dequeue() {
        return super.poll();
    }
}
