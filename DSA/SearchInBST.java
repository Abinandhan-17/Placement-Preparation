public class SearchInBST {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode searchBST(TreeNode root, int val) {

        // Target not found
        if (root == null) {
            return null;
        }

        // Target found
        if (root.val == val) {
            return root;
        }

        // Target is smaller → go left
        if (val < root.val) {
            return searchBST(root.left, val);
        }

        // Target is larger → go right
        return searchBST(root.right, val);
    }

    public static void main(String[] args) {

        /*
                 4
                / \
               2   7
              / \
             1   3
        */

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int target = 2;

        TreeNode result = searchBST(root, target);

        if (result != null) {
            System.out.println("Found: " + result.val);
        } else {
            System.out.println("Not Found");
        }
    }
}