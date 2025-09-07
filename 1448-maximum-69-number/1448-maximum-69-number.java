class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
        int[] arr = new int[str.length()];
       for (int i = 0; i < str.length(); i++) {
    arr[i] = str.charAt(i) - '0'; 
}
        for(int i=0;i<arr.length;i++){
            if(arr[i]==6){
                arr[i]=9;
                i=arr.length;
            }
        }
        StringBuilder sb = new StringBuilder();
for (int digit : arr) {
    sb.append(digit);
}
num = Integer.parseInt(sb.toString());

   return num; }
}