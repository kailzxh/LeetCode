import java.util.*;

class Solution {
    public int findTheWinner(int n, int k) {
        int temp = k;
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i + 1);
        }
        int i = 0;

        while (arr.size() > 1) {   
            temp--;

            if (temp == 0) {
                arr.remove(i);    
                temp = k;        

                if (i == arr.size()) {
                    
                    i = 0;
                }
            } else {
                i++;  
                if (i == arr.size()) {
                    i = 0; 
                }
            }
        }
        return arr.get(0);
    }
}
