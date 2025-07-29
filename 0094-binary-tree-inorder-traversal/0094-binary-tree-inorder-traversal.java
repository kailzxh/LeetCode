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
        List<Integer> List = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);

   return List; }
    public void  inorder(TreeNode node ){
         if (node == null)
            return;
        inorder(node.left);
        List.add(node.val);
        inorder(node.right);

    }
}