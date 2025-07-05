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
    static void preorder(TreeNode r,Queue<TreeNode> q)
    {
        if(r==null) return;
        q.add(r);
        preorder(r.left,q);
        preorder(r.right,q);

    }
    public void flatten(TreeNode root) {

        Queue<TreeNode> q=new LinkedList<>();
        preorder(root,q);
        //skip the head of the tree as we are not returning any thing its the reference
        q.poll();
        while(!q.isEmpty())
        {
            root.right=q.poll();
            root.left=null;
            root=root.right;
        }
        
    }
}