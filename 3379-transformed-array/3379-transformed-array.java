class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] results = new int[n];
        
        for (int i = 0; i < n; i++) {
           
            int totalShift = i + nums[i];
            
            int index = totalShift % n;
            
            if (index < 0) {
                index += n;
            }
   
            results[i] = nums[index];
        }
        
        return results;
    }
}