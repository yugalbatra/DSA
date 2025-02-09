package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DFS {

    ArrayList<Integer> dfs = new ArrayList<>();

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Set<Integer> visited = new HashSet<>();
        dfs.add(0);
        visited.add(0);
        dfs(adj, visited, 0);
        return dfs;
    }

    private void dfs(ArrayList<ArrayList<Integer>> adj, Set<Integer> visited, int i) {
        for (int num : adj.get(i)) {
            if (!visited.contains(num)) {
                dfs.add(num);
                visited.add(num);
                dfs(adj, visited, num);
            }
        }
    }
}
