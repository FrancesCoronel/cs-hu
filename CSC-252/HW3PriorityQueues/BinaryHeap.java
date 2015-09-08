/**
 * priority queue implemented as binary biHeap
 * @see  PriorityQueue.java
 * @author  FVCproductions
 * @since  2-19-15
 * @version  1.0
 */

public class BinaryHeap implements PriorityQueue {
	
	private final int DEF_SIZE = 10;
	private final int DEF_INDEX = 1;
		
	private double[] biHeap;
	private int size;
	
	/**  
	 * creates priority queue that sorts elements according to natural ordering
	 */
	public BinaryHeap() {
		this.biHeap = new double[DEF_SIZE];
		this.size = 0;
	}
	
	/**  
	 * @return true if priority queue is empty, false otherwise
	 */
	public boolean isEmpty() {
		return size() == 0;
	}

	/**  
	 * @return # of elements in priority queue
	 */
	public int size() {
		return size;
	}

	/**
	 * @return smallest element in priority queue, throws EmptyPQException otherwise
	 */
	public double findMin() {
		if (this.isEmpty()) {
			throw new EmptyPQException("priority queue is empty");
		}		
		return biHeap[DEF_INDEX];
	}

	/**  
	 * resize biHeap if not enough space
	 * @param x [element to be inserted]
	 */
	public void insert(double x) {
		if (size >= biHeap.length - 1) {
			resize();
		}
		size++;
		biHeap[size] = x;
		percolateUp();
	}

	/**  
	 * grabs and removes smallest element
	 * @throws EmptyPQException if empty
	 * @return smallest element from priority queue
	 */
	public double deleteMin() {
		if (this.isEmpty()) {
			throw new EmptyPQException("priority queue is empty");
		}
		final double min = findMin();
		biHeap[DEF_INDEX] = biHeap[size];
		size--;
		percolateDown();
		return min;
	}

	/**  
	 * resets priority queue to empty
	 */
	public void makeEmpty() {
		biHeap = new double[DEF_SIZE];
		size = 0;
	}
	
	/**  
	 * restores biHeap order property upon deletion of element
	 * starts at index 1, or root
	 * looks for smallest child first 
	 * if smallest child is smaller than parent
	 * 	then swaps with parent
	 * 	otherwise stops looking
	 */
	private void percolateDown() {
		int index = 1;
		while (hasLeftChild(index)) {
			int smallerChild = leftChild(index);
			
			if (hasRightChild(index) && biHeap[rightChild(index)] < biHeap[smallerChild]) {
				smallerChild = rightChild(index);
			}
			if (biHeap[index] > biHeap[smallerChild]) {
				trade(index, smallerChild);
			} else {
				break;
			}
			index = smallerChild;
		}
	}
	
	/**  
	 * restores biHeap order property upon insertion of element
	 * checks if nodes parents are greater than node
	 * if so, swaps place and repeats process
	 */
	private void percolateUp() {
		int index = size;
		while (hasParent(index) && biHeap[index] < biHeap[parent(index)]) {
			trade(index, parent(index));
			index = parent(index);
		}
	}
	
	/**  
	 * resize Binary Heap when not enough space
	 */
	private void resize() {
		final double[] temp = new double[biHeap.length * 2];
		for (int i = 0; i <= size; i++) {
			temp[i] = biHeap[i];
		}
		biHeap = temp;
	}
	
	/**  
	 * trade values of items in two indices
	 * @param  index1  index of item to trade with index2
	 * @param  index2  index of item to trade with index1
	 */
	private void trade(int index1, int index2) {
		final double temp = biHeap[index1];
		biHeap[index1] = biHeap[index2];
		biHeap[index2] = temp;
	}
	
	/**
	 * @param  i [what is being checked]
	 * @return true [if has left child]
	 */
	private boolean hasLeftChild(int i) {
		return leftChild(i) <= size;
	}

	/**
	 * @param  i [what is being checked]
	 * @return integer [of left child]
	 */
	private int leftChild(int i) {
		return i * 2;
	}
	
	/**
	 * @param  i [what is being checked]
	 * @return true [if has right child]
	 */
	private boolean hasRightChild(int i) {
		return rightChild(i) <= size;
	}

	/**
	 * @param  i [what is being checked]
	 * @return integer [of right child]
	 */
	private int rightChild(int i) {
		return i * 2 + 1;
	}
	
	/**
	 * @param  i [what is being checked]
	 * @return true [if has parent]
	 */
	private boolean hasParent(int i) {
		return i > 1;
	}
	
	/**
	 * @param  i [what is being checked]
	 * @return integer [of parent]
	 */
	private int parent(int i) {
		return i / 2;
	}

}