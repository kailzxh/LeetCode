class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int j=0;
        for(int i=1;i<=n;i++){
            if(j==target.length-1 && target[j]==i ){
                ans.add("Push");
                return ans;
            }
            if(target[j]==i){
                ans.add("Push");
                j++;
            }else{
                ans.add("Push");
                ans.add("Pop");
            }
        }
   return ans; }
}