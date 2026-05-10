class Solution {
        List<String> ans = new ArrayList<>();
       Map<Integer, List<Character>> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        
        map.put(2, new ArrayList<>(List.of('a', 'b', 'c')));
        map.put(3, new ArrayList<>(List.of('d', 'e', 'f')));
        map.put(4, new ArrayList<>(List.of('g', 'h', 'i')));
        map.put(5, new ArrayList<>(List.of('j', 'k', 'l')));
        map.put(6, new ArrayList<>(List.of('m', 'n', 'o')));
        map.put(7, new ArrayList<>(List.of('p', 'q', 'r', 's')));
        map.put(8, new ArrayList<>(List.of('t', 'u', 'v')));
        map.put(9, new ArrayList<>(List.of('w', 'x', 'y', 'z')));
        if(digits.length()==0){
            return ans;
        }
        backtrack(digits,0,"");
        
       

    return ans;}
    private void backtrack(String digits,int index,String cur){
        if(index == digits.length()){
            ans.add(cur);
            return;
        }
        for(char ch:map.get(digits.charAt(index)-'0')){

            backtrack(digits,index+1,cur+ch);
        }
    }
}