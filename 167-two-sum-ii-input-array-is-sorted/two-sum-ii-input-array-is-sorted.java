class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        ArrayList<Integer> list = new ArrayList<>();
        int[] result = new int[2];
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                list.add(left+1);
                list.add(right+1);
                result[0] = list.get(0);
                result[1] = list.get(1);
                // return result;

            }
            if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return result; 
    }
}