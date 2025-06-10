class Solution {
    public boolean isBalanced(TreeNode root) {
          return checkHeight(root) != -1;
    }
        
    private int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1;

        int diff = leftHeight - rightHeight;
        if (diff < -1 || diff > 1) return -1;

        return (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;
        }
}