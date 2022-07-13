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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qt = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        qt.add(root);
        while(!qt.isEmpty()){
            int size = qt.size();
            List<Integer> temp = new ArrayList<>();
            while(size-->0){
                TreeNode x = qt.poll();
                temp.add(x.val);
                if(x.left!=null){
                    qt.add(x.left);
                }
                if(x.right!=null){
                    qt.add(x.right);
                }
            }
            ans.add(temp);
        }
        return ans;
        
    }
}