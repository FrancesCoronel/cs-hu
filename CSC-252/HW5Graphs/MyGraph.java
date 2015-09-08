import java.util.*;

/*
 * A representation of a graph. 
 * Assumes that we do not have negative cost edges in the graph.
 */
public class MyGraph implements Graph 
{
	// you will need some private fields to represent the graph
	// you are also likely to want some private helper methods

	// YOUR CODE HERE
	// each vertex maps to set of edges
	private final Map<Vertex, Set<Edge>> g;

	/**
	 * Creates a MyGraph object with the given collection of vertices and the
	 * given collection of edges.
	 * 
	 * @param v
	 *            a collection of the vertices in this graph
	 * @param e
	 *            a collection of the edges in this graph
	 */
	public MyGraph(Collection<Vertex> v, Collection<Edge> e) 
   {

		// YOUR CODE HERE
		checkEdge(v, e);
		this.g = new HashMap<Vertex, Set<Edge>>();
		for (Vertex theVertex: v)
		{
			g.put(theVertex, new HashSet<Edge>());
			for (Edge theEdge: e)
			{
				if (theEdge.getSource().equals(theVertex))
				{
					g.get(theVertex).add(theEdge);
				}
			}
		}

	}

	/**
	 * Return the collection of vertices of this graph
	 * 
	 * @return the vertices as a collection (which is anything iterable)
	 */
	@Override
	public Collection<Vertex> vertices() 
   {

		// YOUR CODE HERE
		return g.keySet();

	}

	/**
	 * Return the collection of edges of this graph
	 * 
	 * @return the edges as a collection (which is anything iterable)
	 */
	@Override
	public Collection<Edge> edges() 
   {

		// YOUR CODE HERE
		Set<Edge> edgeCollection = new HashSet<Edge>();
		for (Set<Edge> edgeSet : g.values())
		{
			edgeCollection.addAll(edgeSet);
		}
		return edgeCollection;

	}

	/**
	 * Return a collection of vertices adjacent to a given vertex v. i.e., the
	 * set of all vertices w where edges v -> w exist in the graph. Return an
	 * empty collection if there are no adjacent vertices.
	 * 
	 * @param v
	 *            one of the vertices in the graph
	 * @return an iterable collection of vertices adjacent to v in the graph
	 * @throws IllegalArgumentException
	 *             if v does not exist.
	 */
	@Override
	public Collection<Vertex> adjacentVertices(Vertex v) 
   {
		
		// YOUR CODE HERE
		checkVertex(v);
		Set<Vertex> vertexCollection = new HashSet<Vertex>();
		for (Edge theEdge : g.get(v))
		{
			vertexCollection.add(theEdge.getDestination());
		}
		return vertexCollection;

	}

	/**
	 * Test whether vertex b is adjacent to vertex a (i.e. a -> b) in a directed
	 * graph. Assumes that we do not have negative cost edges in the graph.
	 * 
	 * @param a
	 *            one vertex
	 * @param b
	 *            another vertex
	 * @return cost of edge if there is a directed edge from a to b in the
	 *         graph, return -1 otherwise.
	 * @throws IllegalArgumentException
	 *             if a or b do not exist.
	 */
	@Override
	public int edgeCost(Vertex a, Vertex b) 
   {

		// YOUR CODE HERE
		checkVertex(a);
		checkVertex(b);
		for (Edge theEdge: g.get(a))
		{
			if (theEdge.getDestination().equals(b))
			{
				return theEdge.getWeight();
			}		
		}

		// if no edge exists betweeen two vertex parameteres
		return -1;

	}

	/**
	 * Returns the shortest path from a to b in the graph, or null if there is
	 * no such path. Assumes all edge weights are nonnegative. Uses Dijkstra's
	 * algorithm.
	 * 
	 * @param a
	 *            the starting vertex
	 * @param b
	 *            the destination vertex
	 * @return a Path where the vertices indicate the path from a to b in order
	 *         and contains a (first) and b (last) and the cost is the cost of
	 *         the path. Returns null if b is not reachable from a.
	 * @throws IllegalArgumentException
	 *             if a or b does not exist.
	 */
	public Path shortestPath(Vertex a, Vertex b) 
   {

		// YOUR CODE HERE (you might comment this out this method while doing
		// Part 1)
		checkVertex(a);
		checkVertex(b);
		ArrayList<Vertex> shortestPath = new ArrayList<Vertex>();
		if (a.equals(b))
		{
			shortestPath.add(a);
			return new Path(shortestPath, 0);
		}
		else
		{
			// for keeping track of checkUnknown() method
			Set<Vertex> known = new HashSet<Vertex>();
			Set<Vertex> unknown = new HashSet<Vertex>();
			Map<Vertex, Integer> cost = new HashMap<Vertex, Integer>();
			Map<Vertex, Vertex> path = new HashMap<Vertex, Vertex>();

			checkUnknown(unknown, cost, a);

			// Dijstrka's Algorithm
			while (!unknown.isEmpty())
			{
				Vertex target = minNode(unknown, cost);
				known.add(target);
				unknown.remove(target);
				for (Edge theEdge: g.get(target)) {
					Vertex neighbor = theEdge.getDestination();
					if (cost.get(target) + theEdge.getWeight() < cost.get(neighbor) && !known.contains(neighbor))
					{
						cost.put(neighbor, cost.get(target) + theEdge.getWeight());
						path.put(neighbor, target);
					}
				}
			}
			return finalPath(path, shortestPath, cost, a, b);
		}

	}

	/**
	 * 5 new methods (added after shortestPath() method)
		 * 1. checkVertex - checks if vertex parameters exist in graph
		 * 2. checkEdge - checks if there are duplicate edges with different weights
		 * 3. checkUnknown - adds vertices 
		 * 4. minNode - returns cheapest unknown vertex
		 * 5. finalPath - determines path and cost from calling shortestPath()
	 */
	
	/**
	 * Checks if vertex parameters exist in graph
	 * 
	 * @param v  [a collection of the vertices in this graph]
	 * @throws IllegalArgumentException
	 */
	
	private void checkVertex(Vertex v)
	{

		if (!g.containsKey(v))
		{
			throw new IllegalArgumentException();
		}
	
	}
	
	/**
	 * Checks if there are duplicate edges but with different weights
	 * Uses the 3 created Exception classes:
		 * DuplicateEdgeException.java that tests for duplicates edges of different weights
		 * InvalidEdgeException.java that tests for every edge for a corresponding vertex/vertices
		 * InvalidWeightException.java that tests for edges of negative weight
	 * 
	 * @param v [a collection of the vertices in this graph]
	 * @param e [a collection of the edges in this graph]
	 */
	private void checkEdge(Collection<Vertex> v, Collection<Edge> e)
	{

		for (Edge edge1: e)
		{
			if (edge1.getWeight() < 0)
			{
				throw new InvalidWeightException();
			}
			
			Vertex from1 = edge1.getSource();
			Vertex to1 = edge1.getDestination();
			
			if (!v.contains(from1) || !v.contains(to1))
			{
				throw new InvalidEdgeException();
			}
			
			for (Edge edge2: e)
			{
				Vertex from2 = edge2.getSource();
				Vertex to2 = edge2.getDestination();
				if (!edge1.equals(edge2) && from1.equals(from2) && to1.equals(to2) && edge1.getWeight() != edge2.getWeight())
				{
					throw new DuplicateEdgeException();
				}
			}
		}
	
	}

	/**
	 * Add vertices to unknown list and record corresponding initial costs
	 * 
	 * @param  unknown
	 * @param  Map<Vertex>
	 * @param  cost
	 * @param  a
	 * @return unknown
	 */
	
	private Set<Vertex> checkUnknown(Set<Vertex> unknown, Map<Vertex, Integer> cost, Vertex a) 
	{

		for (Vertex theVertex: g.keySet())
		{
			if (theVertex.equals(a))
			{
				cost.put(theVertex, 0);
			}
			else 
			{
				cost.put(theVertex, Integer.MAX_VALUE);
			}
			unknown.add(theVertex);
		}
		
		return unknown;
	
	}

	/**
	 * Returns cheapest unknown vertex
	 * 
	 * @param  unknown
	 * @param  Map<Vertex>
	 * @param  cost
	 * @return minimum node of cheapest unknown vertex
	 */
	private Vertex minNode(Set<Vertex> unknown, Map<Vertex, Integer> cost) {
		
		Vertex minNode = null;
		
		for (Vertex theVertex : unknown) 
		{
			if (minNode == null) 
			{
				minNode = theVertex;
			} 
			else 
			{
				if (cost.get(theVertex) < cost.get(minNode)) 
				{
					minNode = theVertex;
				}
			}
		}
		
		return minNode;
	
	}

	/**
	 * Determines the path and cost to be returned by shortestPath()
	 * 
	 * @param  Map<Vertex>
	 * @param  path
	 * @param  shortestPath
	 * @param  cost
	 * @param  a
	 * @param  b
	 * @return new path from calling shortestPath()
	 */
	
	private Path finalPath(Map<Vertex, Vertex> path, List<Vertex> shortestPath, Map<Vertex, Integer> cost, Vertex a, Vertex b) 
	{

		if (cost.get(b) == Integer.MAX_VALUE) 
		{	
			// if no path
			return null;
		} 
		else 
		{
			Vertex prev = b;

			shortestPath.add(b);
			
			while (!path.get(prev).equals(a)) 
			{
				shortestPath.add(path.get(prev));
				prev = path.get(prev);
			}

			shortestPath.add(a);
			Collections.reverse(shortestPath);
			
			return new Path(shortestPath, cost.get(b));
		}
	
	}

}
