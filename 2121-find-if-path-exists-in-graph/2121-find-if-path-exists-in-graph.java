class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
for (int i = 0; i < n; i++) {
    graph.add(new ArrayList<>());
}
for (int[] edge : edges) {
    graph.get(edge[0]).add(edge[1]);
    graph.get(edge[1]).add(edge[0]); 
}
        Stack<Integer> st =new Stack<>();
        st.push(source);
        boolean[] visited = new boolean[n];
        while(!st.isEmpty()){
            int node = st.pop();
            if(node == destination) return true;
            if(!visited[node]){
                visited[node]=true;
                for(int arr: graph.get(node)){
                     if (!visited[arr]) {
                        st.push(arr);
                    }
                }
            }
        }

   return false; }
}