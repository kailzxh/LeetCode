class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] array =s.split(" ");
       for(int i=array.length-1;i>-1;i--){
        
        String temp = array[i].strip();
        if(temp =="") continue;
        sb.append(temp);
        if(i!=0) sb.append(" ");
       }
       
    return sb.toString().strip();}
}