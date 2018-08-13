package org.psjava.ds.tree.segmenttree;

import org.junit.Assert;
import org.junit.Test;
import org.psjava.ds.array.PSArray;
import org.psjava.ds.array.MutableArrayFromVarargs;

public class SegmentTreeByArrayImplementationTest {

    // TODO add performance test

    @Test
    public void testQueryRecursively() {
        SegmentTree<Integer> tree = createInitTree();
        Assert.assertEquals(10, (int) tree.query(0, 4));
    }

    @Test
    public void testUpdateRecursivelySingle() {
        SegmentTree<Integer> tree = createInitTree();
        tree.update(0, 2);
        Assert.assertEquals(37, (int) tree.query(0, 8));
    }

    private SegmentTree<Integer> createInitTree() {
        PSArray<Integer> init = MutableArrayFromVarargs.create(1, 2, 3, 4, 5, 6, 7, 8);
        return new SegmentTreeByArrayImplementation<>(init, (a, b) -> a + b);
    }
}
