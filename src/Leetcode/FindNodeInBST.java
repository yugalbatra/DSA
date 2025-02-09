package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindNodeInBST {
    Map<Integer, Integer> map = new HashMap<>();

    int max = 0;

    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        addToMap(root);

        for (final var entry : map.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }

    private void addToMap(TreeNode root) {
        if (root == null) {
            return;
        }

        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        max = Math.max(max, map.get(root.val));
        addToMap(root.left);
        addToMap(root.right);
    }
}
