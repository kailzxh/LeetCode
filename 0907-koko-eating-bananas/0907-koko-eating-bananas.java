class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left =1;
        int right =piles[piles.length-1];
        while(left<right){
           int mid=left+(right-left)/2;
           int hrs=0;
            for(int i=0;i<piles.length;i++){
              hrs += (piles[i] + mid - 1) / mid;

            }
            if(h<hrs){
                left=mid+1;
            }
            else{
                right = mid;
            }
        }
   return left; }
}