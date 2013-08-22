package org.psjava.javautil;

import java.util.Iterator;

public class MergedIterable<T> {

	public static <T> Iterable<T> wrap(final Iterable<? extends Iterable<? extends T>> iterables) {
		return new Iterable<T>() {
			@Override
			public Iterator<T> iterator() {
				return new ReadOnlyIterator<T>() {
					Iterator<? extends Iterable<? extends T>> topIterator = iterables.iterator();
					Iterator<? extends T> currentSubIterator = null;

					@Override
					public boolean hasNext() {
						while (currentSubIterator == null || !currentSubIterator.hasNext()) {
							if (topIterator.hasNext())
								currentSubIterator = topIterator.next().iterator();
							else
								return false;
						}
						return true;
					}

					@Override
					public T next() {
						hasNext();
						return currentSubIterator.next();
					}
				};
			}
		};
	}

}