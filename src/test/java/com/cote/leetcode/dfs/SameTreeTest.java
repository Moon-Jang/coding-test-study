package com.cote.leetcode.dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {
    /*
    Input: p = [1,2,3], q = [1,2,3]
Output: true
     */
    @Test
    void isSameTreeTest1() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        SameTree sameTree = new SameTree();
        assertTrue(sameTree.isSameTree(p, q));
    }

    //Input: p = [1,2], q = [1,null,2]
    //Output: false
    @Test
    void isSameTreeTest2() {
        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, null, new TreeNode(2));
        SameTree sameTree = new SameTree();
        assertFalse(sameTree.isSameTree(p, q));
    }

    //Input: p = [1,2,1], q = [1,1,2]
    //Output: false
    @Test
    void isSameTreeTest3() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        SameTree sameTree = new SameTree();
        assertFalse(sameTree.isSameTree(p, q));
    }
}