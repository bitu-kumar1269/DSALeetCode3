class Solution {
    public int numberOfSpecialChars(String word) {
        int count =0;
        int n = word.length();

        for(int i=0; i<26; i++){
            boolean hashLower = false;
            boolean hashUpper = false;

            for(int j=0; j<n; j++){
                if(word.charAt(j) == ('a' + i)){
                    hashLower = true;
                }else if(word.charAt(j) == ('A' + i)){
                    hashUpper = true;
                }

            }
            if(hashLower && hashUpper){
                count++;
                // break;
            }
        }
        return count;
    }
}