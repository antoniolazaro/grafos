package br.ufba.mestrado.algoritimos.grafos.manyaprroaches;

import org.psjava.util.Pair;

import java.util.*;

public class MaximalIndependentSet {

    private Set<Set<Integer>> independentSets;
    private Set<Set<Integer>> maximalIndependentSets;
    private Map<Pair<Integer, Integer>, Integer> edges;
    private List<Integer> vertices;

    public MaximalIndependentSet(){
        independentSets = new HashSet<>();
        maximalIndependentSets = new HashSet<>();
        edges = new HashMap<>();
        vertices = new LinkedList<>();
    }

    void printAllIndependentSets()
    {
        independentSets.forEach(item ->{
            System.out.println("{ ");
            item.forEach(it -> {
                    System.out.println(it+" ");
            });
            System.out.println("} ");
        });
    }

    void printMaximalIndependentSets()
    {
        int maxCount = 0;
        int localCount = 0;
        independentSets.forEach(iter ->{

        });
        for (Set<Integer> iter : independentSets) {

            localCount = 0;
            for (Integer iter2 : iter) {
                localCount++;
            }
            if (localCount > maxCount)
                maxCount = localCount;
        }
        for (Set<Integer> iter : independentSets) {

            localCount = 0;
            Set<Integer> tempMaximalSet = new HashSet<>();

            for (Integer iter2 : iter) {
                localCount++;
                tempMaximalSet.add(iter2);
            }
            if (localCount == maxCount)
                maximalIndependentSets
                        .add(tempMaximalSet);
        }
        for (Set<Integer> iter : maximalIndependentSets) {
            System.out.println("{ ");
            for (Integer iter2 : iter) {
                System.out.println(iter2 + " ");
            }
            System.out.println("}");
        }
    }

    Boolean isSafeForIndependentSet(
            int vertex,
            Set<Integer> tempSolutionSet)
    {
        for (Integer iter : tempSolutionSet) {
            if (edges.get(new Pair(iter, vertex)) == null) {
                return false;
            }
        }
        return true;
    }

    void findAllIndependentSets(
            int currV,
            int setSize,
            Set<Integer> tempSolutionSet)
    {
        for (int i = currV; i <= setSize; i++) {
            if (isSafeForIndependentSet(vertices.get(i - 1),tempSolutionSet)) {
                tempSolutionSet.add(vertices.get(i - 1));
                findAllIndependentSets(i + 1,setSize,tempSolutionSet);
                tempSolutionSet.remove(vertices.get(i - 1));
            }
        }
        independentSets.addAll(Collections.singleton(tempSolutionSet));
    }

    public static void main(String[] args) {
        int V = 3, E = 0;

        MaximalIndependentSet maximalIndependentSet = new MaximalIndependentSet();
        for (int i = 1; i <= V; i++)
            maximalIndependentSet.vertices.add(i);

//        vector<pair<int, int> > inputEdges;

//        pair<int, int> edge;
//        int x, y;
//        for (int i = 0; i < E; i++) {
//            edge.first = inputEdges[i].first;
//            edge.second = inputEdges[i].second;
//            edges[edge] = 1;
//            int t = edge.first;
//            edge.first = edge.second;
//            edge.second = t;
//            edges[edge] = 1;
//        }
//
//        set<int> tempSolutionSet;
//
//        findAllIndependentSets(1,
//                V,
//                tempSolutionSet);
//
//        printAllIndependentSets();
//
//        printMaximalIndependentSets();
    }

}
