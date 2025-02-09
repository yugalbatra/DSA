package Leetcode;

import java.util.*;

public class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        double sum = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();
            sum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode top = queue.poll();
                sum += top.val;
                if (top.left != null) {
                    queue.add(top.left);
                }
                if (top.right != null) {
                    queue.add(top.right);
                }
            }
            ans.add(sum / n);
        }

        return ans;
    }
}
