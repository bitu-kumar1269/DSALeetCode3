class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int rightSum = 0; // total sum = 25
        for(int num : nums){
            rightSum += num;
        }

        int leftSum = 0;
        for(int i=0; i<n; i++){
            rightSum -= nums[i]; // right = 25 - 10 = 15
            ans[i] = Math.abs(leftSum - rightSum); // ans = 0 - 15 = 15
            leftSum += nums[i]; // left = 0 + 10 = 10
        }
        return ans;

    }
}