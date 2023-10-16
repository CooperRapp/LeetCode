import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree extends TreeNode{
    public static void main (String [] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);

        for(double d : averageOfLevels(root)) {
            System.out.println(d);
        }
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> elements = new LinkedList<>();

        if(root == null) {
            return elements;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            double sum = 0;
            int div = queue.size();

            for(int i = 0; i < div; i++) {
                TreeNode curr = queue.poll();
                sum += (double) curr.val;
                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);
            }
            elements.add(sum / div);

        }
        return elements;
    }
}
