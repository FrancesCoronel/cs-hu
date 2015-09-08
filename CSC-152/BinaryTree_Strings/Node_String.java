/***************************************************

fvcproductions

july 24, 2012

Node_String.java class defines the node for the 
BinarySearchTree_String class
essentially this class contains all 
the accessor and mutator methods for the tree nodes 
(all in string format)

Works Specifically for Strings

****************************************************/

public class Node_String {

    //declaring necessary variables
    private String key;
    private Node_String parent;
    private Node_String leftChild;
    private Node_String rightChild;

    //setting node string to key
    public Node_String(String str) {
        key = str;
    }

    //setting all variables defined in function to its properly defined method
    public Node_String(String str, Node_String leftChild, Node_String rightChild) {
        this.setKey(str);
        this.setLeftChild(leftChild);
        this.setRightChild(rightChild);
    }

    //accessor and mutator methods for key
    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    //accessor and mutator methods for parent
    public void setParent(Node_String parent) {
        this.parent = parent;
    }

    public Node_String getParent() {
        return parent;
    }

    //accessor and mutator methods for left child
    public void setLeftChild(Node_String leftChild) {
        this.leftChild = leftChild;
    }

    public Node_String getLeftChild() {
        return leftChild;
    }

    //accessor and mutator methods for right child
    public void setRightChild(Node_String rightChild) {
        this.rightChild = rightChild;
    }

    public Node_String getRightChild() {
        return rightChild;
    }
}
