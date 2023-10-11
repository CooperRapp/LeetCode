public class MaximumDepthOfBinaryTree extends TreeNode {
    public static void main (String [] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int depthLeft = maxDepth(root.left);
        int depthRight = maxDepth(root.right);

        System.out.println(root.val + "   (" + depthLeft + ", " + depthRight + ") + 1");

        return Math.max(depthLeft, depthRight) + 1;
    }
}

