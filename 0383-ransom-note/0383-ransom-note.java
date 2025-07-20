class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ran = ransomNote.toCharArray();
        
        for(int i=0;i< magazine.length();i++){
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for(char ch:ran){
            if(map.containsKey(ch) &&  map.get(ch)>0){
                map.computeIfPresent(ch, (k, v) -> v -1);
            }
            else{
               return false;
            }
        }


   return true; }
}