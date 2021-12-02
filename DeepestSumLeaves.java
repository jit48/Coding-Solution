class Solution {
    int ans=0, d=1;
    public int deepestLeavesSum(TreeNode root) {
        if(root == null) return ans;
        findDeep(root, d);
        findNode(root, 1);
        return ans;
    }
    
    public void findDeep(TreeNode root, int depth){
        if(root == null) return;
        
        if(d<depth){
            d = depth;
        }
        
        
        findDeep(root.left, depth+1);
        findDeep(root.right, depth+1);
    }
    
    public void findNode(TreeNode root, int h){
        if(root == null){
            return;
        }
        if(d == h) ans += root.val;
        
        findNode(root.left, h+1);
        findNode(root.right, h+1);
        
    }
}