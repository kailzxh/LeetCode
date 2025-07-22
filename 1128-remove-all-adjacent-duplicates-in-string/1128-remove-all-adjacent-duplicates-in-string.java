class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && c==st.peek()){
                st.pop();
            }else{
                st.push(c);
            }
        }
         for (char c : st) {
            str.append(c);
        }
        
        
    return new String(str);}
}