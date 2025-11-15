class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;

        int[] ans = new int[2*n];
        int j=-1;
        for(int i=0;i<2*n;i++){
            if(i>=n){
                j++;
            }
            if(j==-1){
                 ans[i]=nums[i];
             
            }else{
                  ans[i]=nums[j];
            }
        }
    return ans;}
}