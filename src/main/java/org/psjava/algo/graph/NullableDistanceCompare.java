package org.psjava.algo.graph;

import org.psjava.math.ns.AddableNumberSystem;

public class NullableDistanceCompare {

	public static <W> int compare(final AddableNumberSystem<W> ns, W d1, W d2) {
		if(d1 == null && d2 == null)
			return 0;
		if(d1 == null)
			return 1;
		if(d2 == null)
			return -1;
		return ns.compare(d1, d2);
	}

}
