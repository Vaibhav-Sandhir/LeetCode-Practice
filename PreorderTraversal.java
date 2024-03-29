class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    public void preorder(TreeNode node, List<Integer> list){
        if(node == null)
            return;

        list.add(node.val);
        preorder(node.left, list);
        preorder(node.right, list);    
    }
}
