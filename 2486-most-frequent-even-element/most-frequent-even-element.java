class Solution {
    public int mostFrequentEven(int[] nums) {
        // Step 1: Count the frequencies of all even numbers
        int[] freq = new int[100001];
        for (int num : nums) {
            if (num % 2 == 0) {
                freq[num]++;
            }
        }

        int maxFreq = 0;
        int ans = -1;

        // Step 2: Find the winner by looping from smallest to largest number
        for (int i = 0; i < freq.length; i += 2) { // i += 2 ensures we only look at even numbers
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = i;
            }
        }

        return ans;
    }
}