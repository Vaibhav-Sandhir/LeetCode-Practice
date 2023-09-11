class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    public int dfs(TreeNode node, int max){
        if(node == null)
            return 0;
        int count = 0;
        
        if(node.val >= max)
            count = 1;

        max = Math.max(node.val, max);

        count += dfs(node.left, max);
        count += dfs(node.right, max);
        return count;    
    }
}
