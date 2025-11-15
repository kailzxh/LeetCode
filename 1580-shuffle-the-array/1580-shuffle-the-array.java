class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for(int i=0 , j=0;i<nums.length;i+=2 , j++){
            ans[i]=nums[j];
        }
        for(int i=1 , j=n;i<nums.length;i+=2, j++){
            ans[i]=nums[j];
        }

   return ans; }
}