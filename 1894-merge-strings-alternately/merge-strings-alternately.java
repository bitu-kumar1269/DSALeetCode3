class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        // StringBuilder str = new StringBuilder();
        // int n = word1.length();
        // int m = word2.length();

        // int left =0, right=0;
        // while(left < n || right < m){
        //     if(left < n)
        //         str.append(word1.charAt(left));
        //         left++;
        //     if(right < m)    
        //         str.append(word2.charAt(right));
        //         right++;
            
        // }
        
        // return str.toString();
        

        // StringBuilder str = new StringBuilder();
        // int m = word1.length(), n = word2.length();
        // int maxLen = Math.max(m, n);

        // for (int i = 0; i < maxLen; i++) {
        //     if (i < m) str.append(word1.charAt(i));
        //     if (i < n) str.append(word2.charAt(i));
        // }

        // return str.toString();

        String res = "";
        int n = word1.length(), m = word2.length();
        int i = 0, j = 0;

        while(i<n || j<m){
            if(i<n){
                res += word1.charAt(i);
                i++;
            }
            if(j < m){
                res += word2.charAt(j);
                j++;
            }
        }
        return res;
        
    }
}