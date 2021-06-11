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
		experimento1(1);
		experimento2(2);
		experimento3(3);
		experimento4(4);
	}

	private static void experimento1(Integer number) {
		Vertex[] vertices = {new Vertex(1), new Vertex(2), new Vertex(3),
							 new Vertex(4), new Vertex(5), new Vertex(6)};

		Edge[] graphEdges = {
							new Edge(1,2),new Edge(1,4),new Edge(1,5),
							new Edge(4,5),new Edge(2,3), new Edge(2,6),
							new Edge(3,4),};

		Graph testGraph = new Graph(vertices, graphEdges);// creates first testGraph
		executeRoutine(testGraph,number);
	}

	private static void executeRoutine(Graph testGraph,Integer number){
		System.out.println("############################################ Total de Vertices: " + testGraph.numVertices() + " ###########################################");
		System.out.println(testGraph);
		VertexCover vertexCover = new VertexCover(testGraph, 100);
		vertexCover.greedyCover(number);
		vertexCover.greedyCoverModified();
	}

	private static void experimento2(Integer number) {
		Vertex[] vertices = {new Vertex(1), new Vertex(2), new Vertex(3),
				new Vertex(4), new Vertex(5)};

		Edge[] graphEdges = {new Edge(1,2),
				new Edge(2,3),				new Edge(3,4),new Edge(3,5)};

		Graph testGraph = new Graph(vertices, graphEdges);// creates first testGraph
		executeRoutine(testGraph,number);
	}

	private static void experimento3(Integer number) {
		Vertex[] vertices = {new Vertex(1), new Vertex(2), new Vertex(3),
				new Vertex(4), new Vertex(5),new Vertex(6),new Vertex(7)};

		Edge[] graphEdges = {
				new Edge(3,2),new Edge(3,1),
				new Edge(1,4),new Edge(1,5),new Edge(1,6),new Edge(1,2),
				new Edge(2,7)
		};

		Graph testGraph = new Graph(vertices, graphEdges);// creates first testGraph
		executeRoutine(testGraph,number);
	}

	private static void experimento4(Integer number) {
		Vertex[] vertices = {new Vertex(1), new Vertex(2), new Vertex(3),
				new Vertex(4), new Vertex(5),new Vertex(6)};

		Edge[] graphEdges = {
				new Edge(1,2),new Edge(1,3),new Edge(2,3),new Edge(2,4),new Edge(4,5),new Edge(4,6)
		};

		Graph testGraph = new Graph(vertices, graphEdges);// creates first testGraph
		executeRoutine(testGraph,number);
	}
}