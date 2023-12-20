package org.example;

import no.cantara.binarytree.BinaryTree;
import no.cantara.binarytree.Node;
import no.cantara.binarytree.NodeFactory;
import no.cantara.binarytree.SimpleBinaryTree;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static no.cantara.binarytree.SimpleBinaryTree.Side.LEFT;
import static no.cantara.binarytree.SimpleBinaryTree.Side.RIGHT;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private static Node root;
    @BeforeAll
    public static void createTree() {
        SimpleBinaryTree bt = new SimpleBinaryTree(NodeFactory.defaultFactory());
        root = bt.insertRoot(1L);
        Node rootLeft = bt.insertNode(2L, root, LEFT);
        Node rootRight = bt.insertNode(3L, root, RIGHT);
        bt.insertNode(4L, rootLeft, LEFT);
        bt.insertNode(5L, rootLeft, RIGHT);
        bt.insertNode(6L, rootRight, LEFT);
        bt.insertNode(7L, rootRight, RIGHT);
    }
    @Test
    public void testMaxDepth_whenMaxDepthIsThree_returnsThree() {
        int expected = 3;
        int actual = Solution.maxDepth(root);
        assertEquals(expected, actual);
    }
    @Test
    public void testMaxDepth_whenRootIsNull_returnsZero() {
        int expected = 0;
        int actual = Solution.maxDepth(null);
        assertEquals(expected, actual);
    }
}
