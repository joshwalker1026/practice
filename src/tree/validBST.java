package tree;

import java.util.ArrayList;

public class validBST {

  ArrayList<Integer> res = new ArrayList<Integer>();

  public boolean isValidBST(final TreeNode root) {
    if (root == null)
      return true;
    return isValidBST(root);
  }

  public void inOrder(final TreeNode node) {
    if (node.left != null)
      inOrder(node.left);
    if (node != null)
      res.add(node.val);
    if (node.right != null)
      inOrder(node.right);
  }

  public void isValidBST2(final TreeNode node) {
    if (node == null)
      return;

    inOrder(node.left);
    res.add(node.val);
    inOrder(node.right);
  }

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(final int x) {
      val = x;
      left = null;
      right = null;
    }
  }
}
