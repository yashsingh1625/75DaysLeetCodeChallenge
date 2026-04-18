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
    int sum =0;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum);
    }
    public  boolean dfs(TreeNode node, int targetSum){
        if(node == null){
            return false;
        }
        sum = sum + node.val;
        if(node.left == null && node.right == null){
            if(sum == targetSum){
                return true;
            }
        }
        if(dfs(node.left, targetSum)){
            return true;
        }
        if(dfs(node.right , targetSum)){
            return true;
        }

        sum = sum-node.val;
        return false;

    }

}