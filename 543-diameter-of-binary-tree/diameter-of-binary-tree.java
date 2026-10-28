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
    public int diameterOfBinaryTree(TreeNode root) {
       if(root==null){
        return 0;
       } 
       int leftheight=height(root.left);
       int rightheight=height(root.right);
       int currentdiameter=leftheight+rightheight;
       int leftdiameter=diameterOfBinaryTree(root.left);
       int rightdiameter=diameterOfBinaryTree(root.right);
    
    return Math.max(currentdiameter,Math.max(leftdiameter,rightdiameter));
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return 1+Math.max(left,right);
    }
}