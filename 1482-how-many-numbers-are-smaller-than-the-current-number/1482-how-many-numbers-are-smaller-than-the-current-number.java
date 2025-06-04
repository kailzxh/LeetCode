class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] help = nums.clone();
        Arrays.sort(help); 
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            int num = nums[i];
           
            int j=0;
            while(j<nums.length){
                if(help[j] < num){

                count++;
                j++;
                }else break;

            }
            result[i]=count;
        }
    return result;}
}