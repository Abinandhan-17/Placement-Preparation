public class SubtreeOfAnotherTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // Empty subtree is always a subtree
        if (subRoot == null) {
            return true;
        }

        // Main tree is empty but subRoot is not
        if (root == null) {
            return false;
        }

        // Check if trees are identical from this node
        if (isSameTree(root, subRoot)) {
            return true;
        }

        // Search in left and right subtrees
        return isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {

        /*
                 3
                / \
               4   5
              / \
             1   2

             Subtree:

                 4
                / \
               1   2
        */

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(4);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        TreeNode subRoot = new TreeNode(4);

        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        System.out.println(isSubtree(root, subRoot));
    }
}