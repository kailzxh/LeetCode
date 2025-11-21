class Solution {
    public int longestSubarray(int[] nums) {
        boolean oneUsed = false;
        int maxCount =0;
        int count =0;
        int last=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(oneUsed){
                    count=i-1-last;
                    last=i;
                }else{
                    oneUsed=true;
                    last=i;
                }
            }
            else{
                count++;
                maxCount=Math.max(maxCount,count);
            }
        }
        if(!oneUsed){
           return maxCount-1;
        }
    return maxCount;}
}