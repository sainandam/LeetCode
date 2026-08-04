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
    public int rangeSumBST(TreeNode root, int low, int high) {
        range(root,low,high);
        return sum;
    }
    private int sum=0;
    public int range(TreeNode root,int low,int high){
        if(root==null) return 0;
        if(root.val>=low&&root.val<=high){
            sum+=root.val;
        }
        range(root.left,low,high);
        range(root.right,low,high);
        return sum;
    }
}