/***************************************************

fvcproductions

july 24, 2012

BinarySearchTree.java class defines the order 
for the traversals; also has algorithm that is 
responsible for properly inserting a node in the 
binary search tree; i.e. greater/equal to root on 
right, less than root on left - recursively

Works Specifically for numbers (int)

****************************************************/

public class BinarySearchTree {
 
    private Node root;
 
    public void insert(String key) {
        insert(new Node(key, null, null));
    }
 
    public void insert(Node z) {
 
        Node y = null;
        Node x = root;
 
        while (x != null) {
            y = x;
 
            if (z.getKey() < x.getKey()) {
                x = x.getLeftChild();
            } else {
                x = x.getRightChild();
            }
        }
 
        z.setParent(y);
 
        if (y == null) {
            root = z;
        } else if (z.getKey() < y.getKey()) {
            y.setLeftChild(z);
        } else {
            y.setRightChild(z);
        }
    }
 
    public void preorderTraversal() {
        preorderTraversal(root);
    }
 
    public void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.getKey() + " ");
            preorderTraversal(node.getLeftChild());
            preorderTraversal(node.getRightChild());            
        }
    }
 
    public void inorderTraversal() {
        inorderTraversal(root);
    }
 
    private void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.getLeftChild());
            System.out.print(node.getKey() + " ");
            inorderTraversal(node.getRightChild());
        }
    }
 
    public void postorderTraversal() {
        postorderTraversal(root);
    }
 
    private void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.getLeftChild());
            postorderTraversal(node.getRightChild());
            System.out.print(node.getKey() + " ");
        }
    }
}