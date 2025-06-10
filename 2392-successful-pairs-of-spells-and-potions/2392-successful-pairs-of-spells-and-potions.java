class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] arr = new int[spells.length];
        Arrays.sort(potions);
        int n = spells.length;
        for(int i=0;i<spells.length;i++){
            int left=0;
            int right =potions.length-1;

            while(right>=left){
            int mid= left+(right-left)/2;
                if((long)spells[i]*potions[mid]>=success){
                   right=mid-1; 
                }else{
                    left=mid+1;
                }

            }
            arr[i]=potions.length-left;
        }
        
    return arr;}

}