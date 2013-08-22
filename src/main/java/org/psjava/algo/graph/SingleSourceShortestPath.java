package org.psjava.algo.graph;

import org.psjava.ds.graph.DirectedAdjacencyListableGraph;
import org.psjava.ds.graph.DirectedWeightedEdge;
import org.psjava.math.ns.AddableNumberSystem;

public interface SingleSourceShortestPath {
	<W, E extends DirectedWeightedEdge<W>> SingleSourceShortestPathResult<W, E> getResult(DirectedAdjacencyListableGraph<E> graph, Object from, AddableNumberSystem<W> ns);	
}