import java.util.*;

class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        // Step 1: Build the adjacency list representation of the graph
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int completeComponentsCount = 0;

        // Step 2: Iterate through all nodes to find each connected component
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int[] nodeCount = new int[1];
                int[] edgeCount = new int[1];

                // Perform DFS to traverse the component
                dfs(i, adj, visited, nodeCount, edgeCount);

                // In an undirected graph, each edge is counted twice during DFS (u -> v and v -> u)
                int totalEdges = edgeCount[0] / 2;
                int vertices = nodeCount[0];

                // Step 3: Check if the component is complete
                if (totalEdges == (vertices * (vertices - 1)) / 2) {
                    completeComponentsCount++;
                }
            }
        }

        return completeComponentsCount;
    }

    private void dfs(int node, List<List<Integer>> adj, boolean[] visited, int[] nodeCount, int[] edgeCount) {
        visited[node] = true;
        nodeCount[0]++; // Count this vertex
        edgeCount[0] += adj.get(node).size(); // Accumulate the degrees of all vertices in this component

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, nodeCount, edgeCount);
            }
        }
    }
}