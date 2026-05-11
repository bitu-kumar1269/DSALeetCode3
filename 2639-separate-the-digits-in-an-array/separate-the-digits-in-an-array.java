class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        List<Integer> digit = new ArrayList<>();

        for(int i=0; i<n; i++ ){
            List<Integer> curr = new ArrayList<>();
            while(nums[i] > 0){
                curr.add(nums[i] % 10);
                nums[i] /=10;
            }
            for (int j = curr.size() - 1; j >= 0; j--) {
                digit.add(curr.get(j));
            }
        }
        int[] res = new int[digit.size()];
        for(int i=0; i<digit.size(); i++){
            res[i] = digit.get(i);

        }
        return res;
    }
}