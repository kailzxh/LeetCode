class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q =new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            q.offer(num);
        }
        int count=0;
        while(!q.isEmpty() ){
            count++;
            if(count==k){
            
                return q.poll();
            }
            q.poll();
        }
    return -1;}
}