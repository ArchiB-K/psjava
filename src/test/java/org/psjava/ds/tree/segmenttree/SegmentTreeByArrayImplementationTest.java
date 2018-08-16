package org.psjava.ds.tree.segmenttree;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SegmentTreeByArrayImplementationTest {

    // TODO add performance test

    @Test
    public void testEmpty() {
        new SegmentTreeByArrayImplementation<Integer>(Collections.emptyList(), Math::max);
    }

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
        List<Integer> init = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        return new SegmentTreeByArrayImplementation<>(init, (a, b) -> a + b);
    }
}
