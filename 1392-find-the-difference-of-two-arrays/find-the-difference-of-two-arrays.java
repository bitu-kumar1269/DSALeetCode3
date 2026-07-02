import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Use boolean arrays to keep track of existing numbers (offset by 1000 for negative numbers)
        boolean[] exist1 = new boolean[2001];
        boolean[] exist2 = new boolean[2001];
        
        for (int num : nums1) {
            exist1[num + 1000] = true;
        }
        for (int num : nums2) {
            exist2[num + 1000] = true;
        }
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        // Scan through the valid range [-1000, 1000]
        for (int i = 0; i <= 2000; i++) {
            if (exist1[i] && !exist2[i]) {
                list1.add(i - 1000); // Revert the offset
            } else if (exist2[i] && !exist1[i]) {
                list2.add(i - 1000);
            }
        }
        
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(list1);
        answer.add(list2);
        
        return answer;
    }
}