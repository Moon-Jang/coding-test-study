package com.cote.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-inorder-traversal/description/?envType=problem-list-v2&envId=depth-first-search
public class BinaryTreeInorderTraversal {
    private final List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return result;
        search(root);
        return result;
    }

    public void search(TreeNode node) {
        if (node.left != null) search(node.left);
        result.add(node.val);
        if (node.right != null) search(node.right);
    }
}
