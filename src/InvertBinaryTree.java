public class InvertBinaryTree extends TreeNode {
    public static void main (String [] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(5);
        root.right = new TreeNode(3);

        root = invertTree(root);

        System.out.println(root.right.right.val);
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        if(root.left == null && root.right == null) return root;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        if(root.left != null) {
            invertTree(root.left);
        }

        if(root.right != null) {
            invertTree(root.right);
        }

        return root;
    }
}
