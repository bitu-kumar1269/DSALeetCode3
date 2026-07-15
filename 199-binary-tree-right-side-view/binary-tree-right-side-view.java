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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int level = q.size();
            for(int i=0; i<level; i++){
                TreeNode temp = q.poll();
                
                if(i == level -1){
                    result.add(temp.val);
                }
                // Enqueue left node
                if(temp.left != null){
                    q.add(temp.left);
                }
                // Enqueue right node
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }
        return result;
    }
}