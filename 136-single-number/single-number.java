class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> list=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(list.contains(nums[i])){
                list.remove(nums[i]);
            }else{
                list.add(nums[i]);
            }
        }
        for(int num: list){
            return num;
        }
        return 0;
    }
}