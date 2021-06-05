package br.ufba.mestrado.algoritimos.grafos.psjava;

import org.psjava.algo.graph.MinimumVertexCoverAlgorithmInBipartiteGraph;
import org.psjava.algo.graph.matching.HopcroftKarpAlgorithm;
import org.psjava.ds.graph.MutableBipartiteGraph;

public class KonigTheoremMain {

    public static void main(String[] args) {
        MutableBipartiteGraph<String> g = MutableBipartiteGraph.create();

        g.insertLeftVertex("A");
        g.insertLeftVertex("B");
        g.insertLeftVertex("C");

        g.insertRightVertex("X");
        g.insertRightVertex("Y");
        g.insertRightVertex("Z");

        g.addEdge("A", "X");
        g.addEdge("A", "Y");
        g.addEdge("A", "Z");
        g.addEdge("B", "Z");
        g.addEdge("C", "Z");

// By Konig's Theorem, In any bipartite graph, the number of edges in a maximum matching equals the number of vertices in a minimum vertex cover.
// So matching algorithm is used in its implementation. In this example, Hopcroft-Karp algorithm is used.
        MinimumVertexCoverAlgorithmInBipartiteGraph algorithm = KonigTheorem.getInstance(HopcroftKarpAlgorithm.getInstance());

        int number = algorithm.calcMinimumVertexCover(g); // result is 2, ("A", "C")

        System.out.println(number);
    }
}
