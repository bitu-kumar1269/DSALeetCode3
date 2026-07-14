class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num: nums){
            if(num > max){
                max = num;
            }
            if(num < min ){
                min = num;
            }
        }
        
        while(max != 0){
            int temp = max;
            max = min % max;
            min = temp;
        }
        return min;
    }
}