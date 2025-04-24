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
    List<List<Integer>> list ;
    public List<List<Integer>> levelOrder(TreeNode root) {
        list = new ArrayList<>();
       
   return   bfs(root);}
    private List<List<Integer>> bfs(TreeNode node) {
        if (node == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
       

        while (!queue.isEmpty()) { 
        List<Integer> innerlist =new ArrayList<>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode currNode =queue.poll(); 
                innerlist.add(currNode.val);

            if (currNode.left != null) queue.add(currNode.left);
            if (currNode.right != null) queue.add(currNode.right);
            }
            list.add( innerlist);
        }
    return list;}
    
}