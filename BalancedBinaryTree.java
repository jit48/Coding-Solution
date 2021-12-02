class Solution {
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
         if(root == null) return true;
        
        height(root);
        return res;
    }
    
    public int height(TreeNode root){
        if(root == null) return 0;
        
        int left = height(root.left);
        int right = height(root.right);
        
        if(Math.abs(left-right)>1){
            res = false;
        }
        return 1+Math.max(left, right);
    }
}