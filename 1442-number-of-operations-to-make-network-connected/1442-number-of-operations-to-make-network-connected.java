class Solution {
    public int makeConnected(int n, int[][] connections) {
         if (connections.length < n - 1) return -1;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] conn : connections) {
            graph.get(conn[0]).add(conn[1]);
            graph.get(conn[1]).add(conn[0]);
        }

        boolean[] visited = new boolean[n];
        int components = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited);
                components++;
            }
        }
        return components - 1;
    }

    private void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        Stack<Integer> st = new Stack<>();
        st.push(node);
        visited[node] = true;

        while (!st.isEmpty()) {
            int curr = st.pop();
            for (int neighbor : graph.get(curr)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    st.push(neighbor);
                }
            }
        }
    }
}
