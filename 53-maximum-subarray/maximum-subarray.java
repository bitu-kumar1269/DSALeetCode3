class Solution {
    public int maxSubArray(int[] nums) {
        int maxEnd= nums[0];
        int max = nums[0];

        for(int i=1; i<nums.length; i++){
            maxEnd = Math.max(maxEnd + nums[i], nums[i]);

            max = Math.max(max , maxEnd);
        }
        return max;
    }
}