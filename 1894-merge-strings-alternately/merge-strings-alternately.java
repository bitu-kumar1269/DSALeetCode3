class Solution {
    public String mergeAlternately(String word1, String word2) {
        /*
        StringBuilder str = new StringBuilder();

        int left =0, right=0;
        while(left < word1.length() && right < word2.length()){
            str.append(word1.charAt(left));
            str.append(word2.charAt(right));
            left++;
            right++;
        }
        
        while(left < word1.length()){
            str.append(word1.charAt(left));
            left++;
        }

        while(right < word2.length()){
            str.append(word2.charAt(right));
            right++;
        }
        return str.toString();
        */

        StringBuilder str = new StringBuilder();
        int m = word1.length(), n = word2.length();
        int maxLen = Math.max(m, n);

        for (int i = 0; i < maxLen; i++) {
            if (i < m) str.append(word1.charAt(i));
            if (i < n) str.append(word2.charAt(i));
        }

        return str.toString();
        
    }
}