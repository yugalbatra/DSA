package Graph;

import java.util.ArrayList;

public class DetectCycleDirectedGraph {

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCyclic(adj, new boolean[V], visited, i)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isCyclic(ArrayList<ArrayList<Integer>> adj, boolean[] recursionStack, boolean[] visited, int i) {
        if (recursionStack[i]) return true;
        if (visited[i]) return false;
        recursionStack[i] = true;
        visited[i] = true;
        for (int num : adj.get(i)) {
            if (isCyclic(adj, recursionStack, visited, num)) return true;
        }
        recursionStack[i] = false;

        return false;
    }
}
