public class DiameterOfBinaryTree {

    public static class TreeNode {
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
        }
    }

    static int diameter = 0;

    public static int diameterOfBinaryTree(TreeNode root) {

        height(root);

        return diameter;
    }

    public static int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Diameter passing through current node
        int currentDiameter = leftHeight + rightHeight;

        diameter = Math.max(diameter, currentDiameter);

        // Return height
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \
             4   5
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(
            "Diameter: " + diameterOfBinaryTree(root)
        );
    }
}