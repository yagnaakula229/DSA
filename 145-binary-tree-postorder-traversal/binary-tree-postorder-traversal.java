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

    public static List<Integer> postorder(TreeNode root, List<Integer> ls){
        if(root==null){
            return ls;
        }

        postorder(root.left,ls);
        postorder(root.right,ls);
        ls.add(root.val);

        return ls;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        return postorder(root,ls);
    }
}