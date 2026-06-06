//with extra space
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int[] ans = new int[nums.length];
//         j=0;
//         for(int i=nums.length-k;i<nums.length;i++){
//             ans[j]=nums[i];
//             j++;
//         }
//         for(int i=0;i<nums.length-k;i++){]
//         ans[j]=nums[i];
//         i++;
//         }
//   return ans;  }
// }
//in-place approach - time limit exceeded


// class Solution {
//     public void rotate(int[] nums, int k) {
//         while(k>0){
//            int element = nums[nums.length-1];//7
//            int temp =nums[0]; //2
//            for(int i=1;i<nums.length;i++){
//                 System.out.print(nums[i]+" ");
//                 System.out.println();
//                 int Temp=nums[i]; //3
//                 nums[i]=temp; //1
//                 temp=Temp; //2
//                 System.out.print(nums[i]+" ");
//            }
//            nums[0]=element;
//            k--;
//         }
//     }
// }

class Solution {
    public void rotate(int[] nums, int k) {
         k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    private void reverse(int[] nums, int l , int r){
        while(l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}