public class SumRootToLeafNumbers extends TreeNode {
    public static void main (String [] args ) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(sumNumbers(root));
    }

    public static int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private static int dfs(TreeNode root, int val) {
        if(root == null) return 0;

        val = (val * 10) + root.val;

        if(root.left == null && root.right == null) return val;

        return dfs(root.left, val) + dfs(root.right, val);

    }
}