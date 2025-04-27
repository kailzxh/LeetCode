class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length + 1;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        for (int i = 1; i <= n; i++) {
            if (graph.get(i).size() == n - 1) {
                return i;
            }
        }
        
        return -1; 
    }
}
