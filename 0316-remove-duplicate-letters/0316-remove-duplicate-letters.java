class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastin = new int[26];
        for(int i=0;i<s.length();i++){
            lastin[s.charAt(i)-'a']=i;
        }
       Stack<Character> st= new Stack<>();
        boolean[] visited = new boolean[26];
        
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(visited[ch-'a']) continue;
            while(!st.isEmpty() && ch < st.peek() && lastin[st.peek()-'a']>i){
                char removed = st.pop();
                visited[removed - 'a'] = false;

            }
            st.push(ch);
            visited[ch-'a']=true;

        }
        StringBuilder sb = new StringBuilder();
        for(char ch: st) sb.append(ch);
        return sb.toString();

}
}