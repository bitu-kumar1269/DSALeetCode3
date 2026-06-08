class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int idx = 0;

        for(int num: nums){
            if(num < pivot){
                result[idx++] = num;
            }
        }
        for(int num: nums){
            if(num == pivot){
                result[idx++] = num;
            }
        }
        for(int num: nums){
            if(num > pivot){
                result[idx++]=num;
            }
            
        }
        return result;
    }
}