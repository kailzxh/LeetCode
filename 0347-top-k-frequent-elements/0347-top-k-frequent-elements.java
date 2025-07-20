class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }
       for (int i=0;i<k;i++){
        res[i]=search(map);
       }
    return res;}
    private int search( HashMap<Integer, Integer> map){
        int max = Integer.MIN_VALUE;
        int ans=-1;
        for (int key : map.keySet()){
        int val = map.get(key);
        if(val>max){
            ans =key;
            max=val;
        }
       
       }
       
       map.remove(ans);

       
   return ans; }
}