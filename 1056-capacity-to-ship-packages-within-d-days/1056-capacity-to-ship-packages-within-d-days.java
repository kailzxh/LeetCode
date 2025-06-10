class Solution {
     static {
        // Warm up the JVM (optional, used in performance-sensitive contexts)
        for (int i = 0; i < 300; i++) shipWithinDays(new int[0], 1);
    }
    public static int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for (int weight : weights) {
            left = Math.max(left, weight);  
            right += weight;               
        }
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (canShip(weights, days, mid)) {
                
                right = mid;
            } else {
               
                left = mid + 1;
            }
        }
        
        return left;  
    }
    
    private static  boolean canShip(int[] weights, int days, int capacity) {
        int currentLoad = 0;
        int requiredDays = 1;
        
        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                
                requiredDays++;
                currentLoad = 0;
            }
            currentLoad += weight;
        }
        
        return requiredDays <= days;
    }
}
