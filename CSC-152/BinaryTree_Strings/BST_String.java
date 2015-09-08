/***************************************************

fvcproductions

july 24, 2012

BST_String.java driver prints out user's input from text file
uses user input to print trees out in certain traversal orders - pre, post, etc.

Works Specifically for Strings

****************************************************/


import java.util.*;
import java.io.*;

public class BST_String {

    public static void main(String[] args) throws FileNotFoundException {

        /*a binary search tree is structured in a special way,
        where the following is true:
            1. each value in the node is greater than or equal to value stored in left sub child
            2. each value in the node is less than value stored in right sub child
        */

        BinarySearchTree_String bst = new BinarySearchTree_String();

        //declaring numbers to be put into an integer type array (11 names)
        String[] input = new String[11];

        //using scanner to process/read Names.txt file which contains the 11 names

        Scanner scan = new Scanner(new File("Names.txt"));

        scan.useDelimiter(" "); //space as delimiter

        while (scan.hasNext()) {
            for (int i = 0; i < input.length; i++)
                input[i] = scan.next();
        }

        scan.close();


        /*
        inserts each element from the data set called "input"
        into the predefined binary search tree called "bst"
        */

        for (String i : input) {
				//System.out.println(i);
            bst.insert(i);
        }

        /* using integer values in pre-defined array:

        computer performs preorder traversal to binary search tree
        generally speaking then, preorder traversals work in this way:
            1. root value printed
            2. left sub tree visited
            3. right sub tree visited
            4. repeat steps 2-3 recursively until all subtrees have been visited

        */

        System.out.println("\nPreorder Traversal:");
        bst.preorderTraversal();

        /* using integer values in pre-defined array:

        computer performs in-order traversal to binary search tree
        generally speaking then, in-order traversals work in this way:
            1. left sub tree visited
            2. print all values recursively until left sub tree is empty
            2. root value printed
            3. right sub tree visited
            4. print all values recursively until right sub tree is empty

        */
        System.out.println( "\nInorder Traversal:");
        bst.inorderTraversal();

        /* using integer values in pre-defined array:

        computer performs postorder traversal to binary search tree
        generally speaking then, postorder traversals work in this way:
            1. left sub tree visited until null
            2. right sub tree visited until null
            3. given node printed
            4. prints all values recursively until either left or right sub tree empty

        */

        System.out.println("\nPostorder Traversal:");
        bst.postorderTraversal();
    }
}

/* -- OUTPUT --

Preorder Traversal:
Matthew Ann Mary Kara Anthony Ann Kent Sara Tom Thomas Whitney 
Inorder Traversal:
Ann Ann Anthony Kara Kent Mary Matthew Sara Thomas Tom Whitney 
Postorder Traversal:
Ann Anthony Kent Kara Mary Ann Thomas Whitney Tom Sara Matthew 

*/
