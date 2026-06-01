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

    public void preorder(TreeNode root, List<String> ls) {

        if (root == null) {
            ls.add("null");
            return;
        }

        ls.add(String.valueOf(root.val));

        preorder(root.left, ls);
        preorder(root.right, ls);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        List<String> ls1 = new ArrayList<>();
        List<String> ls2 = new ArrayList<>();

        preorder(p, ls1);
        preorder(q, ls2);

        return ls1.equals(ls2);
    }
}