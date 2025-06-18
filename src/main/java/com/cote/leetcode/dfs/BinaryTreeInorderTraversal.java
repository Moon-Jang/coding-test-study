package com.cote.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

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

  public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
