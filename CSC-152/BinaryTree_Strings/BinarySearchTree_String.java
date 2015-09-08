/***************************************************

fvcproductions

july 24, 2012

BinarySearchTree_String.java class defines the order 
for the traversals; also has algorithm that is 
responsible for properly inserting a node in the 
binary search tree; i.e. greater/equal to root on 
right, less than root on left - recursively

Works Specifically for Strings

****************************************************/


public class BinarySearchTree_String {

    private Node_String root;

    public void insert(String key) {

        insert(new Node_String(key, null, null));

    }

    //insertion method for binary tree
    //smaller on left, larger on right

    public void insert(Node_String item) { 

        Node_String y = null;
        Node_String x = root;

        while(x != null) { // while root does not equal null

            y = x; //null equal root

            if(item.getKey().compareTo(x.getKey()) < 0) { // if node string item less than root(comparing string values)
                x = x.getLeftChild(); //grabs left child (less than) and sets root to left child
            } else {
                x = x.getRightChild(); //vice versa, grabs right child and sets root to right child
            }
        }

        item.setParent(y); //setting node string parent as null

        if (y == null) {  //if y is null ^ it is
            root = item; //root equal to node string item
        } else if (item.getKey().compareTo(y.getKey()) < 0) { // if node string item more than root (comparing string values)
            y.setLeftChild(item); //sets null to left child 
        } else {
            y.setRightChild(item); //vice versa sets null to right chilld
        }
    }


    public void preorderTraversal() {
        preorderTraversal(root);
    }

    //preorder is root, left, right

    public void preorderTraversal(Node_String node) {
        if (node != null) {
            System.out.print(node.getKey() + " ");
            preorderTraversal(node.getLeftChild());
            preorderTraversal(node.getRightChild());
        }
    }

    public void inorderTraversal() {
        inorderTraversal(root);
    }

    //inorder is left, root, right

    private void inorderTraversal(Node_String node) {
        if (node != null) {
            inorderTraversal(node.getLeftChild());
            System.out.print(node.getKey() + " ");
            inorderTraversal(node.getRightChild());
        }
    }

    public void postorderTraversal() {
        postorderTraversal(root);
    }

    //postorder is left, right, root

    private void postorderTraversal(Node_String node) {
        if (node != null) {
            postorderTraversal(node.getLeftChild());
            postorderTraversal(node.getRightChild());
            System.out.print(node.getKey() + " ");
        }
    }
}
