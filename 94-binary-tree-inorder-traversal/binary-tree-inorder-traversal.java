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
    public static List<Integer> inorder(TreeNode root,List<Integer> ls){
        if(root==null){
            return ls;
        }

        inorder(root.left,ls);
        ls.add(root.val);
        inorder(root.right,ls);

        return ls;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
       ArrayList<Integer> ls = new ArrayList<>();
       return inorder(root,ls);
    }
}