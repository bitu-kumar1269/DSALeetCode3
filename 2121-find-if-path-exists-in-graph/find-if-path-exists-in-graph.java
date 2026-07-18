class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination){
            return true;
        }
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        //Using BFS 
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.offer(source);
        visited[source] = true;

        while(!q.isEmpty()){
            int curr = q.poll();
            if(curr == destination){
                return true;
            }
            for(int neighbor: graph.get(curr)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }
        return false;
    }
}