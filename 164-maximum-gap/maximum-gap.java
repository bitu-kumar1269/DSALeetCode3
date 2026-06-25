class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);

        int max = Integer.MIN_VALUE;
        if(nums.length==1) return 0;
        for(int i=1; i<nums.length; i++){
            int diff = 0;
            if(nums[i] > nums[i-1]){
                diff = nums[i] - nums[i-1];
            }
            max = Math.max(max, diff);
        }
        return max;
    }
}