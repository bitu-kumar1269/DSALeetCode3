class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for(int i=0; i<=n; i++){
            String binaryStr = Integer.toBinaryString(i);
            int count = 0;
            for(int j=0; j< binaryStr.length(); j++){
                if(binaryStr.charAt(j) == '1'){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}