class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int totalSum = 0;
        
        // Variables for Kadane's (to find Max Subarray)
        int maxEnd = 0;
        int maxLinear = Integer.MIN_VALUE;
        
        // Variables for Reverse Kadane's (to find Min Subarray)
        int minEnd = 0;
        int minLinear = Integer.MAX_VALUE;
        
        for (int num : arr) {
            totalSum += num;
            
            // Standard Kadane's for maximum
            maxEnd = Math.max(maxEnd + num, num);
            maxLinear = Math.max(maxLinear, maxEnd);
            
            // Kadane's variant for minimum
            minEnd = Math.min(minEnd + num, num);
            minLinear = Math.min(minLinear, minEnd);
        }
        
        // Edge case: If all elements are negative, maxLinear is the answer
        if (maxLinear < 0) {
            return maxLinear;
        }
        
        // Return the maximum of the non-circular and circular paths
        return Math.max(maxLinear, totalSum - minLinear);
    }
}