/*
 *  Tree Traversals
 *  Provided by Bruce
 */

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

public class TreeTraversals {
  /*
   * Main Program
   */
  public static void main(String[] args) throws IOException {
    Tree pointer;
    String parent;
    String child;

    String input;

    // Create a Scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);

    // Get the filename
    System.out.print("Enter the filename: ");
    String filename = keyboard.nextLine();
    System.out.println(" ");

    // Make sure the file exists
    File file = new File(filename);
    if (!file.exists()) {
      System.out.println("File " + filename + " does not exist");
      System.exit(0);
    }

    // Open the file
    Scanner inputFile = new Scanner(file);

    // Print a heading for the graph edges
    System.out.println("The Tree\n");

    // Create the root node
    input = inputFile.nextLine();
    StringTokenizer st = new StringTokenizer(input);

    parent = st.nextToken();
    child = st.nextToken();

    // Print the Parent and the first Child for the root
    System.out.println(parent + " " + child);

    Tree root = new Tree(parent);
    root.newChild(child);

    // Process the graph file
    while (inputFile.hasNext()) {
      // Read a line from the graph file
      input = inputFile.nextLine();

      // Create a Tokenizer object
      st = new StringTokenizer(input);

      // Read Parent and Child
      parent = st.nextToken();
      child = st.nextToken();

      // Print the Parent and Child
      System.out.println(parent + " " + child);

      // Find the Parent
      pointer = root.find(root, parent);
      pointer.newChild(child);
    }

    // Close the file
    inputFile.close();
    System.out.println(" ");

    // inOrder Trasversal of the Tree
    System.out.println("inOrder Traversal");
    root.inOrder(root);
    System.out.println("\n");

    //preOrder Trasversal of the Tree
    System.out.println("preOrder Traversal");
    root.preOrder(root);
    System.out.println("\n");

    //postOrder Trasversal of the Tree
    System.out.println("postOrder Traversal");
    root.postOrder(root);
    System.out.println(" ");
  }
}