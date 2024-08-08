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
    String s[] = {"",""};
    int i=0;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // if(root1 == null || root2 == null){
        //     return false;
        // }

        isSimilar(root1);
        i++;
        isSimilar(root2);

        return s[0].equals(s[1]);
    }

    void isSimilar(TreeNode root){
        
        if(root.left == null && root.right == null){
            s[i] += ""+root.val+",";
            return;
        }
        else{
            if(root.left != null) isSimilar(root.left);
            if(root.right != null) isSimilar(root.right);
        }
    }
}
