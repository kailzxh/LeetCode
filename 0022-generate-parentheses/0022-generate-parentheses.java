class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if(n==0) return ans;
        backtrack(n,0,0,"");
    return ans;}
    public void  backtrack(int n,int O, int C,String cur){
        if(C==n){
            ans.add(cur);
            return;
        }
        if(O<n){
            backtrack(n,O+1,C,cur+"(");
        }
        if(C<O){
            backtrack(n,O,C+1,cur+")");
        }
    }

}