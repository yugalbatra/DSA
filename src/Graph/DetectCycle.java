package Graph;

import java.util.*;

public class DetectCycle {

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> nonCyclicNodes = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        int start = -1;
        while (visited.size() != V) {
            int a = 0;
            while (queue.isEmpty()) {
                if (!visited.contains(a)) {
                    queue.add(a);
                    nonCyclicNodes.add(start);
                    start = a;
                }
                a++;
            }
            for (int i : adj.get(queue.peek())) {
                if (visited.contains(i)) {
                    if (nonCyclicNodes.contains(i)) {
                        continue;
                    }
                    return true;
                }
                queue.add(i);
            }
            visited.add(queue.poll());
        }

        return false;
    }
}
