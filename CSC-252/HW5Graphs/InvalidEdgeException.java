/**
* This exception notifies the user that if for a given edge, there exists no corresponding vertex/vertices.
* 
* @author FVCproductions
* @since March 25 2015
* 
* NOTES FROM HW ASSIGNMENT: 
	* The constructor should check that the arguments make sense and throw an appropriate exception otherwise.  You can define your own exceptions by making classes like the exception classes we have provided you in previous homeworks.  Here is what we mean by make sense: 
	* - The edges should involve only vertices with labels that are in the vertices of the graph.  That is, there should be no edge from or to a vertex labeled A if there is no vertex with label A. 
	* Edge weights should not be negative. 
	* - Do not throw an exception if the collection of vertices has repeats in it:  If two vertices in the collection have the same label, just ignore the second one encountered as redundant information. 
	* - Do throw an exception if the collection of edges has the same directed edge more than once with a different weight.  Remember in a directed graph an edge from A to B is not the same as an edge from B to A.  Do not throw an exception if an edge appears redundantly with the same weight;  just ignore the redundant edge information. 
*/

public class InvalidEdgeException extends RuntimeException 
{
	
	public InvalidEdgeException() 
	{

	}

	public InvalidEdgeException(String message) 
	{
		super(message);
	}

}