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
    public boolean isSymmetric(TreeNode root) {
       if(root==null){
        return true;
       }
       return isSymetric(root.left,root.right);
    }
    public boolean isSymetric(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
         if(left==null || right==null){
            return false;
        }
        return (left.val==right.val)&&isSymetric(left.left,right.right)&&isSymetric(left.right,right.left);
    }
}