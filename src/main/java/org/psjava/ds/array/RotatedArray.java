package org.psjava.ds.array;

import org.psjava.ds.ArrayFromItemGetter;
import org.psjava.util.GetterByIndex;

public class RotatedArray {

    public static <T> Array<T> wrap(final Array<T> original, final int newStartIndex) {
        return ArrayFromItemGetter.create(original.size(), new GetterByIndex<T>() {
            @Override
            public T get(int index) {
                return original.get((newStartIndex + index) % original.size());
            }
        });
    }

    private RotatedArray() {
    }

}
