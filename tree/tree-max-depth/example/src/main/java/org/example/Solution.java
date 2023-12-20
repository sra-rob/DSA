package org.example;

import no.cantara.binarytree.Node;

public class Solution {
    public Solution(){}
    public static int maxDepth(Node root) {
        if(root == null) return 0;
        int leftSubtreeDepth = maxDepth(root.left());
        int rightSubtreeDepth = maxDepth(root.right());
        return 1 + Math.max(leftSubtreeDepth, rightSubtreeDepth);
    }
}
