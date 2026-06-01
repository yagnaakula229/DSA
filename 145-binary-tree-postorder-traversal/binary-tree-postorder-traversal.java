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
// class Solution {

//     public static List<Integer> postorder(TreeNode root, List<Integer> ls){
//         if(root==null){
//             return ls;
//         }

//         postorder(root.left,ls);
//         postorder(root.right,ls);
//         ls.add(root.val);

//         return ls;
//     }
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> ls = new ArrayList<>();
//         return postorder(root,ls);
//     }
// }


class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        st1.push(root);

        while (!st1.isEmpty()) {

            TreeNode node = st1.pop();

            st2.push(node);

            if (node.left != null) {
                st1.push(node.left);
            }

            if (node.right != null) {
                st1.push(node.right);
            }
        }

        while (!st2.isEmpty()) {
            ans.add(st2.pop().val);
        }

        return ans;
    }
}