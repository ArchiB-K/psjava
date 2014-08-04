package org.psjava.algo.graph.dfs;

import org.psjava.ds.graph.AdjacencyListFromGraph;
import org.psjava.ds.graph.DirectedEdge;
import org.psjava.ds.graph.Graph;

public class AllSourceDFS {

	/**
	 * Remember that visiting order is not ordered.
	 */
	public static <V, E extends DirectedEdge<V>> void traverse(Graph<V, E> graph, DFSVisitor<V, E> visitor) {
		MultiSourceDFS.traverse(AdjacencyListFromGraph.createFromDirected(graph), graph.getVertices(), visitor);
	}

	private AllSourceDFS() {
	}

}
