/**
 * priority queue implemented as ternary heap
 * @see  ThreeHeap.java
 * @author  FVCproductions
 * @since  2-19-15
 * @version  1.0
 */

public class ThreeHeap implements PriorityQueue {
	
	//setting default size and index
	private final int DEF_SIZE = 10;
	private final int DEF_INDEX = 1;

	//array representation of threeHeap
	private double[] threeHeap;	
	
	//amount of elements in priority queue
	private int size;

	//constructs priority queue ADT
	public ThreeHeap() {
		this.threeHeap = new double[DEF_SIZE];
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
	 * @throws [EmptyPQException] [if empty]
	 * @return smallest element in priority queue, throws EmptyPQException otherwise
	 */	
	public double findMin() {
		if (isEmpty()) {
			throw new EmptyPQException("priority queue is empty");
		}
		return threeHeap[DEF_INDEX];
	}

	/**  
	 * @param x [element to be inserted]
	 */
	public void insert(double x) {
		if (size >= threeHeap.length - 1) {
			resize();
		}	
		size++;
		threeHeap[size] = x;
		percolateUp();
	}

	/**  
	 * grabs and then deletes minimum value
	 * resets heap
	 * @return smallest element from priority queue
	 * @throws [EmptyPQException] [if empty]
	 */
	public double deleteMin() {
		if (this.isEmpty()) {
			throw new EmptyPQException("Priority Queue is empty.");
		}
		final double min = findMin();
		threeHeap[DEF_INDEX] = threeHeap[size];
		size--;
		percolateDown();
		return min;
	}

	/**  
	 * resets priority queue to empty
	 */
	public void makeEmpty() {
		threeHeap = new double[10];
		size = 0;
	}

	/**  
	 * restores heap order property upon deletion of element
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
			if (hasMiddleChild(index) && threeHeap[middleChild(index)] < threeHeap[smallerChild]) {
				smallerChild = middleChild(index);
			}
			if (hasRightChild(index) && threeHeap[rightChild(index)] < threeHeap[smallerChild]
					) {
				smallerChild = rightChild(index);
			}
			if (threeHeap[index] > threeHeap[smallerChild]) {
				trade(index, smallerChild);
			} else {
				break;
			}
			index = smallerChild;
		}
	}
	
	/**  
	 * restores heap order property upon insertion of element
	 * checks if nodes parents are greater than node
	 * if so, swaps place and repeats process
	 */
	private void percolateUp() {
		int index = size;
		while (hasParent(index) && threeHeap[index] < threeHeap[parent(index)]) {
			trade(index, parent(index));
			index = parent(index);
		}
	}
	
	/**  
	 * resize Binary Heap when not enough space
	 */
	private void resize() {
		final double[] temp = new double[threeHeap.length * 2];
		for (int i = 0; i <= size; i++) {
			temp[i] = threeHeap[i];
		}
		threeHeap = temp;
	}
	
	/**  
	 * trade values of items in two indices
	 * @param  index1  index of item to trade with index2
	 * @param  index2  index of item to trade with index1
	 */
	private void trade(int index1, int index2) {
		final double temp = threeHeap[index1];
		threeHeap[index1] = threeHeap[index2];
		threeHeap[index2] = temp;
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
	 * @return integer of left child
	 */
	private int leftChild(int i) {
		return i * 3 - 1;
	}
	
	/**
	 * @param  i [what is being checked]
	 * @return true [if has middle child]
	 */
	private boolean hasMiddleChild(int i) {
		return middleChild(i) <= size;
	}

	/**
	 * @param  i [what is being checked]
	 * @return integer of middle child
	 */
	private int middleChild(int i) {
		return i * 3;
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
	 * @return integer of right child
	 */
	private int rightChild(int i) {
		return i * 3 + 1;
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
	 * @return integer of parent
	 */
	private int parent(int i) {
		return (i + 1) / 3;
	}

}