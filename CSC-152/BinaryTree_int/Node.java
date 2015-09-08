/***************************************************

fvcproductions

july 24, 2012

Node.java class defines the node for the BinarySearchTree class

-> essentially this class contains all 
the accessor and mutator methods for the tree nodes 
(all in int format)

Works Specifically for numbers (int)

****************************************************/

public class Node {

    private int key;
    private Node parent;
    private Node leftChild;
    private Node rightChild;

    public Node(int key, Node leftChild, Node rightChild) {
        this.setKey(key);
        this.setLeftChild(leftChild);
        this.setRightChild(rightChild);
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getParent() {
        return parent;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getRightChild() {
        return rightChild;
    }
}
