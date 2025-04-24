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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        p=0;
        return constBST(preorder,inorder,0,inorder.length-1,hm);
    }
    public TreeNode constBST(int[] preorder,int[] inorder,int l,int h,HashMap<Integer,Integer> hm){
        if(l>h) return null;
        int idx=hm.get(preorder[p++]);
        TreeNode root=new TreeNode(inorder[idx]);
        root.left=constBST(preorder,inorder,l,idx-1,hm);
        root.right=constBST(preorder,inorder,idx+1,h,hm);
        return root;
    }
}