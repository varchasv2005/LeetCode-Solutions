class Solution {
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return ans;
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;

        int left = depth(root.left);
        int right = depth(root.right);

        ans = Math.max(ans, left + right);

        return 1 + Math.max(left, right);
    }
}