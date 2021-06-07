package br.ufba.mestrado.algoritimos.grafos.manyaprroaches;

/*
 * VertexCoverTester class - a tester class for the VertexCover class.
 * 
 * Can be used with the VertexCover, Graph, Edge, and Vertex classes.
 * Allows the language of a graph to be used when programming.
 */
public class VertexCoverTester {
	// Main method - contains various tests relating to VertexCover methods
	public static void main(String[] args) {
		experimento1();
		System.out.println();// displays blank line between graphs/tests
//		experimento2();

	}

	private static void experimento1() {
		Vertex[] vertices = {new Vertex(1), new Vertex(2), new Vertex(3),
							 new Vertex(5), new Vertex(4)};
		Edge[] graphEdges = {new Edge(0,1), new Edge(0,2), new Edge(1,2),
				   	    new Edge(1,3), new Edge(1,4), new Edge(1,5)};

		Graph testGraph = new Graph(vertices, graphEdges);// creates first testGraph
		// Displays the first testGraph information
		System.out.println("# of Vertices: " + testGraph.numVertices());
		System.out.println(testGraph);
		// Creates the testGraph and runs various Vertex Cover approaches
		VertexCover vertexCover = new VertexCover(testGraph, 2);// creates VertexCover instance with Graph and k
		// runs Greedy Cover approach
		vertexCover.bruteForce();// runs Brute Force approach
		vertexCover.optimizedBruteForce();// runs Optimized Brute Force approach
		vertexCover.firstSolution();// runs First Solution approach
		vertexCover.greedyCover();// runs Greedy Cover approach
		vertexCover.greedyCoverModified();
		vertexCover.approxCover();// runs Approx Cover approach
		vertexCover.approxCoverModified();
	}

	private static void experimento2() {
		Vertex[] vertices = {new Vertex(1), new Vertex(2), new Vertex(3),
				new Vertex(5), new Vertex(4)};

		Edge[] graphEdges = {new Edge(0,1), new Edge(0,2), new Edge(1,2),
				new Edge(1,3), new Edge(3,4), new Edge(3,5), new Edge(2,4)};

		Graph testGraph = new Graph(vertices, graphEdges);// creates first testGraph
		// Displays the first testGraph information
		System.out.println("# of Vertices: " + testGraph.numVertices());
		System.out.println(testGraph);
		// Creates the testGraph and runs various Vertex Cover approaches
		VertexCover vertexCover = new VertexCover(testGraph, 2);// creates VertexCover instance with Graph and k
		vertexCover.bruteForce();// runs Brute Force approach
		vertexCover.optimizedBruteForce();// runs Optimized Brute Force approach
		vertexCover.firstSolution();// runs First Solution approach
		vertexCover.greedyCover();// runs Greedy Cover approach
		vertexCover.approxCover();// runs Approx Cover approach
	}
}// VertexCoverTester class
