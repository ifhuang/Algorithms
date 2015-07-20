package leetcode.algorithms;

import leetcode.util.TreeNode;

public class LowestCommonAncestorofaBinarySearchTree {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root.val > p.val && root.val > q.val)
      return lowestCommonAncestor(root.left, p, q);
    else if (root.val < p.val && root.val < q.val)
      return lowestCommonAncestor(root.right, p, q);
    else
      return root;
  }
}