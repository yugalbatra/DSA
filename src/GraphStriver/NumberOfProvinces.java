package GraphStriver;

import java.util.ArrayList;

public class NumberOfProvinces {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        boolean[] visited = new boolean[V];
        int count = 0;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                count++;
                dfs(adj, i, visited);
            }
        }

        return count;
    }

    static void dfs(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited) {
        visited[i] = true;

        for (int neighbour = 0; neighbour < adj.get(i).size(); neighbour++) {
            if (adj.get(i).get(neighbour) == 1 && !visited[neighbour]) {
                dfs(adj, neighbour, visited);
            }
        }
    }
}
