/**
 * priority queue implementation through linked list
 * duplicates not allowed
 * order of return depends on priority
 * @see  MyPQ.java
 * @author  FVCproductions
 * @since  2-19-15
 * @version  1.0
 */

public class MyPQ implements PriorityQueue {

    //front element in  priority queue
    private ListNode front;
    //amount of elements in  priority queue
    private int size; 

    //support class that creates next element to be inserted into priority queue
    class ListNode {
       
        //next element in  priority queue
        public ListNode next; 
        //value to be kept track of
        public double data; 

        /**
         * constructs list node with a given value and next node
         * @param  data [given value]
         * @param  next [next node]
         */
        public ListNode(double data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        //constructs list node with only a given value
        public ListNode(double data) {
            this(data, null);
        }

        //constructor list node without parameters
        public ListNode() {
            this(0.0, null);
        }
    }

    //constructs priority queue ADT
    public MyPQ() {
        this.front = null;
        this.size = 0;
    }

    /**
     * @return [true if no elements present]
     */
    public boolean isEmpty() {
        return (front == null);
    }

    /**
     * @return [# of elements]
     */
    public int size() {
        return this.size;
    }

    /**
     * @return [smallest #]
     */
    public double findMin() {
        if (this.isEmpty()) {
            throw new EmptyPQException();
        }
        return this.front.data;
    }

    /**
     * @param x [value to be inserted]
     */
    public void insert(double x) {
        if (front == null) {
            front = new ListNode(x);
        } else if (x < front.data) {
            ListNode temp = front;
            front = new ListNode(x, temp);
        } else {
            ListNode current = front;
            while (current.next != null && current.next.data < x) {
                current = current.next;
            }
            ListNode temp = current.next;
            current.next = new ListNode(x, temp);
        }
        this.size++;
    }

    /**
     * @return [smallest element]
     */
    public double deleteMin() {
        if (this.isEmpty()) {
            throw new EmptyPQException();
        }
        double min = front.data;
        front = front.next;
        this.size--;
        return min;
    }

    //resets priority queue to empty
    public void makeEmpty() {
        this.front = null;
        this.size = 0;
    }

}