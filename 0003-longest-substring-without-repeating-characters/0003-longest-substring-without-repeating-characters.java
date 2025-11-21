class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int left=0;
        int count=0;
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(st.contains(arr[i])){
                
                while(st.contains(arr[i])){

                st.remove(arr[left]);
                left++;
                }
                st.add(arr[i]);
            }else{
                st.add(arr[i]);
                count= Math.max(count,st.size());
            }
        }
   return count; }
}