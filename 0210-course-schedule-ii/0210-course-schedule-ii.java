class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int[] pair : prerequisites) {
            int course = pair[0];
            int prereq = pair[1];
            map.computeIfAbsent(prereq, k -> new ArrayList<>()).add(course);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] visiting = new boolean[numCourses];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (!dfs(i, map, visited, visiting, stack)) {
                    return new int[0]; // Cycle detected
                }
            }
        }

        int[] result = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            result[i] = stack.pop();
        }
        return result;
    }

    private boolean dfs(int node, Map<Integer, ArrayList<Integer>> map,
                        boolean[] visited, boolean[] visiting, Stack<Integer> stack) {
        if (visiting[node]) return false; 
        if (visited[node]) return true;

        visiting[node] = true;

        for (int neighbor : map.getOrDefault(node, new ArrayList<>())) {
            if (!dfs(neighbor, map, visited, visiting, stack)) {
                return false;
            }
        }

        visiting[node] = false;
        visited[node] = true;
        stack.push(node);
        return true;
    }
}
