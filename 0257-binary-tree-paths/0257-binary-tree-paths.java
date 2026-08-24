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
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        path(root,"", ans);
        return ans;
    }
    public void path(TreeNode root, String currentPath, List<String> ans){

        currentPath += root.val;

        if(root.left == null && root.right == null){
            ans.add(currentPath);
            return;
        }

        currentPath += "->";

        if(root.left != null){
            path(root.left,currentPath,ans);
        }
        if(root.right != null){
            path(root.right,currentPath,ans);
        }
        
    }
}