class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0; 

        for(int i=0; i<n; i++){
            if(sum < 0){
                sum = 0;
            }
            sum += nums[i];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}