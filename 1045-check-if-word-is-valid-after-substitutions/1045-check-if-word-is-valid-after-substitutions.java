class Solution {
    public boolean isValid(String s) {
        if(s.charAt(0)!='a') return false;
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i)=='a' && str.charAt(i+1)=='b' && str.charAt(i+2)=='c'){
                str.delete(i, i+3);
                 i = -1;
            }
        }
        if(str.length()==0) return true;
    return false;}
}