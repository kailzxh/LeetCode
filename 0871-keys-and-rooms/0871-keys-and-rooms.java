// class Solution {
//     public boolean canVisitAllRooms(List<List<Integer>> rooms) {
//        Stack<Integer> stack = new Stack<>();
//        boolean[] visited = new boolean[rooms.size()];
//         stack.push(0);

//           while (!stack.isEmpty()) {
//             int room = stack.pop();
//             if (!visited[room]) {
//                 visited[room] = true;
//                 for (int key : rooms.get(room)) {
//                     if (!visited[key]) {
//                         stack.push(key);
//                     }
//                 }
//             }
//         }
//         for (boolean v : visited) {
//             if (!v) return false;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        while(!q.isEmpty()){
            int room =q.poll();
           if (!visited[room]) {
                visited[room] = true;
                for (int key : rooms.get(room)) {
                    if (!visited[key]) {
                        q.offer(key);
                    }
                }
            }
        }
        for (boolean v : visited) {
            if (!v) return false;
        }
        return true;
    }
}