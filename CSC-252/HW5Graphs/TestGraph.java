/**
	 * TestGraph.java
	 * Testing File For MyGraph.java
	 * @author FVCproductions
	 * @since March 25 2015
 */


import java.util.*;;

public class TestGraph
{
	public static void main(String[] args) 
	{

		/**
		 * creating vertices a through g
		 * @param  "a"
		 * @param  "b"
		 * @param  "c"
		 * @param  "d"
		 * @param  "e"
		 * @param  "f"
		 * @param  "g"
		 * @see Vertex
		 */
		
		Vertex a = new Vertex("a");
		Vertex b = new Vertex("b");
		Vertex c = new Vertex("c");
		Vertex d = new Vertex("d");
		Vertex e = new Vertex("e");
		Vertex f = new Vertex("f");
		Vertex g = new Vertex("g");
		
		/**
		 * adding a through g vertices in Hash Set
		 * @see  Set<Vertex>, HashSet<Vertex>
		 */
		
		Set<Vertex> vertices = new HashSet<Vertex>();
		vertices.add(a);
		vertices.add(b);
		vertices.add(c);
		vertices.add(d);
		vertices.add(e);
		vertices.add(f);
		vertices.add(g);
	
		/**
		 * adding edges using newly created vertices
		 * @see  Set<Edge>, HashSet<Edge>
		 */
		Set<Edge> edges = new HashSet<Edge>();
		edges.add(new Edge(c, a, 2));
		edges.add(new Edge(a, d, 1));
		edges.add(new Edge(b, a, 2));
		edges.add(new Edge(c, d, 1));
		edges.add(new Edge(c, f, 2));
		edges.add(new Edge(d, f, 6));
		edges.add(new Edge(d, g, 5));
		edges.add(new Edge(d, e, 1));
		edges.add(new Edge(d, b, 5));
		edges.add(new Edge(e, b, 1));
		edges.add(new Edge(f, g, 10));	
		edges.add(new Edge(g, e, 3));
		

		/**
		 * creating MyGraph object called graph using vertices and edges created above
		 * @see  MyGraph.java
		 * Notes from HW Assignment
			 * If there is no path, return null. 
			 * If the start and end vertex are equal, return a path containing one vertex and a cost of 0.
			 * Otherwise, the path will contain at least two vertices, the start and end vertices and any other vertices along the lowest-cost path.  The vertices should be in the order they appear on the path. 
		 */
		MyGraph graph = new MyGraph(vertices, edges);

		/**
		 * @return 0 [a]
		 */
		System.out.print(graph.shortestPath(a, a).cost + " ");
		System.out.println(graph.shortestPath(a, a).vertices);
		
		/**
		 * @return 3 [a, d, e, b]
		 */
		System.out.print(graph.shortestPath(a, b).cost + " ");
		System.out.println(graph.shortestPath(a, b).vertices);
		
		/**
		 * @return null
		 */
		System.out.println(graph.shortestPath(a, c));
		
		/**
		 * @return  1 [a, d]
		 */
		System.out.print(graph.shortestPath(a, d).cost + " ");
		System.out.println(graph.shortestPath(a, d).vertices);
		
		/**
		 * @return  2 [a, d, e]
		 */
		System.out.print(graph.shortestPath(a, e).cost + " ");
		System.out.println(graph.shortestPath(a, e).vertices);
		
		/**
		 * @return 7 [a, d, f]
		 */
		System.out.print(graph.shortestPath(a, f).cost + " ");
		System.out.println(graph.shortestPath(a, f).vertices);		
		
		/**
		 * @return 6 [a, d, g]
		 */
		System.out.print(graph.shortestPath(a, g).cost + " ");
		System.out.println(graph.shortestPath(a, g).vertices);
		
		/**
		 * x is unsupported operation as it should be since it wasn't declared as a vertex
		 * @return Exception in thread "main" java.lang.UnsupportedOperationException
		 * @param  "x"
		 */
		System.out.println(graph.vertices().add(new Vertex("x")));
	
	}
}