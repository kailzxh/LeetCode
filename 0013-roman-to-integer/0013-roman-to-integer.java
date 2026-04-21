class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        String us=s.toUpperCase();
        char[] arr=us.toCharArray();
        int final_ans=0;
        int i=0;
        for(i=0;i<arr.length-1;i++){
            int ans =0;
            if(arr[i] == 'I' && arr[i+1]  == 'V'){
                ans=4;
                i++;
            }else if(arr[i]  == 'I' && arr[i+1]   == 'X'){
                ans=9;
                i++;
            }else if(arr[i]  == 'X' && arr[i+1]   == 'L'){
                ans=40;
                i++;
            }else if(arr[i]  == 'X' && arr[i+1] == 'C'){
                ans=90;
                i++;
            }else if(arr[i]  == 'C' && arr[i+1]  == 'D'){
                ans=400;
                i++;
            }else if(arr[i]  == 'C' && arr[i+1]   == 'M'){
                ans=900;
                i++;
            }else{
                ans=map.get(arr[i]);
            }
            final_ans+=ans;
    
            
        }
        if(i != arr.length ) final_ans+=map.get(arr[arr.length-1]);
   return final_ans; }
}