package org.psjava.algo.graph.dfs;

import org.psjava.ds.graph.AdjacencyList;
import org.psjava.ds.graph.AdjacencyListFromGraph;
import org.psjava.ds.graph.DirectedEdge;
import org.psjava.ds.graph.Graph;
import org.psjava.ds.map.MutableMap;

public class SingleSourceDFS {

	public static <V, E extends DirectedEdge<V>> void traverse(Graph<V, E> graph, V start, DFSVisitor<V, E> visitor) {
		// TODO inline
		AdjacencyList<V, E> adj = AdjacencyListFromGraph.create(graph);
		traverse(adj, start, visitor);
	}

	public static <V, E extends DirectedEdge<V>> void traverse(AdjacencyList<V, E> adj, V start, DFSVisitor<V, E> visitor) {
		MutableMap<V, DFSStatus> status = DFSCore.createInitialStatus(adj.getVertices());
		DFSCore.traverse(adj, status, start, visitor);
	}
}
