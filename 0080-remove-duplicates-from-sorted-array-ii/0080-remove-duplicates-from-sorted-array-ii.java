class Solution {
    public int removeDuplicates(int[] nums) {
            int count=0;
        for(int i=0;i<nums.length-2-count;i++){
            for(int j=i+2;j<nums.length-count;j++){
                if(nums[i]==nums[j]){
                    int temp=nums[j];
                    count++;
                    for(int k=j;k<nums.length-1;k++){
                        nums[k]=nums[k+1];
                    }
                    j--;
                    nums[nums.length-1]=temp;
                }else break;
            }
        }
   return nums.length-count; }
}