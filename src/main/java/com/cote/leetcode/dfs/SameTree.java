package com.cote.leetcode.dfs;

import java.util.*;

// https://leetcode.com/problems/same-tree/description/?envType=problem-list-v2&envId=depth-first-search
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.val != q.val) return false;

        if (!isSameTree(p.left, q.left)) return false;
        if (!isSameTree(p.right, q.right)) return false;

        return true;
    }
}
