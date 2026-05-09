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
    private int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return 1 + Math.max(left, right);
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        int leftheight = getHeight(root.left);
        int rightheight = getHeight(root.right);

        if(Math.abs(leftheight - rightheight) > 1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }
}