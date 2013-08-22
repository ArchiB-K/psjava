package org.psjava.algo.sort;

import java.util.Comparator;

import org.psjava.ds.array.ArraySwapper;
import org.psjava.ds.array.MutableArray;


public class BubbleSort implements Sort {
	
	@Override
	public <T> void sort(MutableArray<T> a, Comparator<T> comparator) {
		for (int i = 0; i < a.size(); i++)
			for (int j = 0; j < a.size() - 1; j++)
				if (comparator.compare(a.get(j), a.get(j + 1)) > 0)
					ArraySwapper.swap(a, j, j + 1);
	}

}