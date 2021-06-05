package br.ufba.mestrado.algoritimos.grafos.psjava;

import org.psjava.algo.graph.MinimumVertexCoverAlgorithmInBipartiteGraph;
import org.psjava.algo.graph.matching.HopcroftKarpAlgorithm;
import org.psjava.ds.graph.BipartiteGraph;
import org.psjava.ds.graph.MutableBipartiteGraph;
import org.psjava.algo.graph.matching.MaximumBipartiteMatchingAlgorithm;
import org.psjava.ds.graph.BipartiteGraph;

public class KonigTheorem {

    public static MinimumVertexCoverAlgorithmInBipartiteGraph getInstance(final MaximumBipartiteMatchingAlgorithm subAlgorithm) {
        return new MinimumVertexCoverAlgorithmInBipartiteGraph() {
            @Override
            public <V, E> int calcMinimumVertexCover(BipartiteGraph<V> bg) {
                return subAlgorithm.calc(bg).getMaxMatchCount();
            }
        };
    }

    private KonigTheorem() {}
}
