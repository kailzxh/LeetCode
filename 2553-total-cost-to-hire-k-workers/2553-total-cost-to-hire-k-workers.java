import java.util.PriorityQueue;

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        int left = candidates;
        int right = n - candidates - 1;

       
        PriorityQueue<Integer> leftHeap = new PriorityQueue<>();
        PriorityQueue<Integer> rightHeap = new PriorityQueue<>();

        
        for (int i = 0; i < candidates && i < n; i++) {
            leftHeap.offer(costs[i]);
        }
        for (int i = n - 1; i >= n - candidates && i >= left; i--) {
            rightHeap.offer(costs[i]);
        }

        long totalCost = 0;
        
        for (int hire = 0; hire < k; hire++) {
            int leftMin = leftHeap.isEmpty() ? Integer.MAX_VALUE : leftHeap.peek();
            int rightMin = rightHeap.isEmpty() ? Integer.MAX_VALUE : rightHeap.peek();

            if (leftMin <= rightMin) {
                
                totalCost += leftHeap.poll();
                
                if (left <= right) {
                    leftHeap.offer(costs[left]);
                    left++;
                }
            } else {
                
                totalCost += rightHeap.poll();
                
                if (left <= right) {
                    rightHeap.offer(costs[right]);
                    right--;
                }
            }
        }

        return totalCost;
    }
}
