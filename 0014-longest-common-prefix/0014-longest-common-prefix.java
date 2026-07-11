class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        List<Character> li= new ArrayList<>();
        for(char c:strs[0].toCharArray()){
            li.add(c);
        }
        for (int i = 1; i < strs.length; i++) {
    char[] arr = strs[i].toCharArray();

    for (int j = 0; j < arr.length; j++) {
        if (j >= li.size()) break;

        if (li.get(j) != arr[j]) {
            li.subList(j, li.size()).clear();
            break;
        }
    }

    if (li.size() > arr.length) {
        li.subList(arr.length, li.size()).clear();
    }

    if (li.isEmpty()) return "";
}
        for(char l:li){
            sb.append(l);
        }
   return sb.toString(); }
}