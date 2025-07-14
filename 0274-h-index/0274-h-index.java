class Solution {
    public int hIndex(int[] citations) {
        int ans =0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length / 2; i++) {
    int temp = citations[i];
    citations[i] = citations[citations.length - 1 - i];
    citations[citations.length - 1 - i] = temp;
}
        for(int i=0;i<citations.length;i++){
            if(citations[i]>=i+1){
                ans=i+1;
            }else{
                return ans;
            }
        }
    return ans;}
}