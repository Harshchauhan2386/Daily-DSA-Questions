/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private TreeNode small = null, big = null, prev = null;

    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = small.val;
        small.val = big.val;
        big.val = temp;
    }

    private void inorder(TreeNode r) {
        if (r == null) return;

        inorder(r.left);

        if (prev != null && prev.val > r.val) {
            small = r;
            if (big != null) return;
            big = prev;
        }

        prev = r;
        inorder(r.right);
    }
}
