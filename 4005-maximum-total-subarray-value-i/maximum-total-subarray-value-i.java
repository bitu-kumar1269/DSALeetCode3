class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num: nums){
            if(num > max) max = num;
            if(num < min) min = num;
        }
        System.out.print(min);
        int res = max - min;
        return 1l * res * k;
    }
}