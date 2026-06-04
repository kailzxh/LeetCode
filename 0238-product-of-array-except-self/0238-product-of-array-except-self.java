// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int[] out= new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//         int l=0;
//         int r=nums.length-1;
//             int sum=1;
//             while(l<i || r>i){
//                 if(l<i && r>i){
//                     sum*=nums[l];
//                     sum*=nums[r];
//                     l++;
//                     r--;
//                 }else if(r>i){
//                     sum*=nums[r];
//                     r--;

//                 }else{
//                     sum*=nums[l];
//                     l++;
//                 }
//             }
//             out[i]=sum;
//         }
//     return out;}
// }
// time optimization
class Solution {
     public int[] productExceptSelf(int[] nums) {
        int presum=nums[0];
        int[] arrpost = new int[nums.length];
        int total=1;
        for(int i=nums.length-1;i>=0;i--){
            total*=nums[i];
            arrpost[i]=total;
        }
        int[] out = new int[nums.length];
       
            out[0]=arrpost[1];

        
        for(int i=1;i<nums.length;i++){
            if(nums.length-1==i){
                out[i]=presum;
            }else{
                out[i]=presum*arrpost[i+1];
                presum*=nums[i];
            }
        }
    return out; }
}