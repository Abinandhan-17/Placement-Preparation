public class MaximumDepthOfBinaryTree {

    public static class TreeNode {
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
        }
    }

    public static int maxDepth(TreeNode root) {

        // Base case
        if (root == null) {
            return 0;
        }

        // Find left and right depths
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // Return maximum depth
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static void main(String[] args) {

        /*
                 3
                / \
               9   20
                  /  \
                 15   7
        */

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = maxDepth(root);

        System.out.println("Maximum Depth: " + result);
    }
}