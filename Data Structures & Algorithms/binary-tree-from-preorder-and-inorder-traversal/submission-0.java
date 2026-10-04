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
    int p=0;
    public TreeNode build(int[]preorder,int[]inorder,int l,int r){
        if(l>r)return null;
        int val=preorder[p++];
        TreeNode root=new TreeNode(val);
        int index=l;
        while(inorder[index]!=val)index++;
        root.left=build(preorder,inorder,l,index-1);
        root.right=build(preorder,inorder,index+1,r);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,preorder.length-1);
    }
}
