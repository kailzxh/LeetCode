class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> need = new HashMap<>();
        char[] tarr = t.toCharArray();
        for (char c : tarr) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> have = new HashMap<>();
        char[] sarr = s.toCharArray();

        int required = t.length(); 
        int formed = 0;          
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;
        for (int right = 0; right < sarr.length; right++) {

            char c = sarr[right];
            have.put(c, have.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) && have.get(c) <= need.get(c)) {
                formed++;
            }
            while (formed == required) {
                int windowSize = right - left + 1;
                if (windowSize < minLen) {
                    minLen = windowSize;
                    startIndex = left;
                }
                char leftChar = sarr[left];
                have.put(leftChar, have.get(leftChar) - 1);
                if (need.containsKey(leftChar) && have.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }

                left++; 
            }
        }

        return minLen == Integer.MAX_VALUE 
                ? "" 
                : s.substring(startIndex, startIndex + minLen);
    }
}
