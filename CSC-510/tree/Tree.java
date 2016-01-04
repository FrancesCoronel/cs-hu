/**
 * Tree Class
 * FVCproductions
 * December 19th, 2015
 */

public class Tree {
  final static int NODES = 10;
  protected String vertex;
  protected Tree nodes[] = new Tree[NODES];
  /**
   * Tree
   * @param  vertex [String]
   */
  public Tree(String vertex) {
    this.vertex = vertex;
    for (int i = 0; i < NODES; i++) {
      nodes[i] = null;
    }
  }
  /**
   * find function
   * @param  pointer [Tree]
   * @param  vertex  [String]
   * @return r
   */
  public Tree find(Tree pointer, String vertex) {
    if (pointer.vertex.equals(vertex)) return pointer;
    Tree r = null;
    for (int i = 0; r == null && pointer.nodes[i] != null; i++) {
      r = find(pointer.nodes[i], vertex);
    }
    return r;
  }
  /**
   * newChild function
   * @param  vertex [String]
   * @return newChild
   */
  public Tree newChild(String vertex) {
    int i = 0;
    while (this.nodes[i++] != null);
    this.nodes[--i] = new Tree(vertex);
    return this.nodes[i];
  }
  /**
   * inOrder algorithm
   * @param  pointer [Tree]
   * @return pointer
   */
  public Tree inOrder(Tree pointer) {

    if (pointer.nodes[0] == null)
      System.out.print(pointer.vertex + " ");
    else {
      inOrder(pointer.nodes[0]);
      System.out.print(pointer.vertex + " ");
      for (int i = 1; pointer.nodes[i] != null; i++) {
        inOrder(pointer.nodes[i]);
      }
    }
    return pointer;
  }
  /**
   * preOrder algorithm
   * @param  pointer [Tree]
   * @return pointer
   */
  public Tree preOrder(Tree pointer) {
    if (pointer.nodes[0] == null)
      System.out.print(pointer.vertex + " ");
    else {
      System.out.print(pointer.vertex + " ");
      preOrder(pointer.nodes[0]);
      for (int i = 1; pointer.nodes[i] != null; i++) {
        preOrder(pointer.nodes[i]);
      }
    }
    return pointer;
  }
  /**
   * postOrder algorithm
   * @param  pointer [Tree]
   * @return pointer
   */
  public Tree postOrder(Tree pointer) {
    if (pointer.nodes[0] == null)
      System.out.print(pointer.vertex + " ");
    else {
      postOrder(pointer.nodes[0]);
      for (int i = 1; pointer.nodes[i] != null; i++) {
        postOrder(pointer.nodes[i]);
      }
      System.out.print(pointer.vertex + " ");
    }
    return pointer;
  }
}