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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> arr = new ArrayList<>();
        if(root==null)
        return arr;
        Queue<TreeNode> q = new LinkedList<>();
        int k=0;
          q.offer(root);
        while(!q.isEmpty()){
          
            int s = q.size();
            ArrayList<Integer> l = new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode curr = q.poll();

                l.add(curr.val);
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);

            }
            if(k%2==0){
                arr.add(l);
            }
            else{
                Collections.reverse(l);
                arr.add(l);

            }
            k++;

        }
        return arr;
    }
}