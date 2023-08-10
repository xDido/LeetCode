class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSame(p, q);
    }

    public boolean isSame(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true; 
        }
        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false; 
        }

        boolean leftSubtree = isSame(p.left, q.left);
        boolean rightSubtree = isSame(p.right, q.right);

        return leftSubtree && rightSubtree;
    }
}
