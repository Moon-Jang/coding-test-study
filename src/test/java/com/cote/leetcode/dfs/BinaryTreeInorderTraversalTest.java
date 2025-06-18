package com.cote.leetcode.dfs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInorderTraversalTest {
    @Test
    void example1() {
        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1);
        root.right = new BinaryTreeInorderTraversal.TreeNode(2);
        root.right.left = new BinaryTreeInorderTraversal.TreeNode(3);

        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        assertEquals(List.of(1, 3, 2), binaryTreeInorderTraversal.inorderTraversal(root));
    }

    @Test
    void example2() {
        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1);
        root.left = new BinaryTreeInorderTraversal.TreeNode(2);
        root.right = new BinaryTreeInorderTraversal.TreeNode(3);
        root.left.left = new BinaryTreeInorderTraversal.TreeNode(4);
        root.left.right = new BinaryTreeInorderTraversal.TreeNode(5);
        root.right.right = new BinaryTreeInorderTraversal.TreeNode(8);
        root.left.right.left = new BinaryTreeInorderTraversal.TreeNode(6);
        root.left.right.right = new BinaryTreeInorderTraversal.TreeNode(7);
        root.right.right.left = new BinaryTreeInorderTraversal.TreeNode(9);

        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        assertEquals(List.of(4, 2, 6, 5, 7, 1, 3, 9, 8), binaryTreeInorderTraversal.inorderTraversal(root));
    }
}