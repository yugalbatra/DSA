package Graph;

import java.util.*;

public class BFS {

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        ArrayList<Integer> bfs = new ArrayList<>();
        bfs.add(0);
        while (!queue.isEmpty()) {
            int top = queue.poll();
            for (int i : adj.get(top)) {
                if (!visited.contains(i)) {
                    bfs.add(i);
                    visited.add(i);
                    queue.add(i);
                }
            }
        }

        return bfs;
    }
}
