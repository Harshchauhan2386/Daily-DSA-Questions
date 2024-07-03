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
    public void inorder(TreeNode root, ArrayList<Integer> array)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,array);
        array.add(root.val);
        inorder(root.right,array);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> array =new ArrayList<Integer>();
        inorder(root,array);
        return array;
    }
}
