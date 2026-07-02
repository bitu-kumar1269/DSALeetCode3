class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums1 == null || nums2 == null) {
            return res;
        }
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());

        int[] hash1 = new int[2001];
        for (int num : nums1) {
            hash1[num + 1000] = 1;
        }
        int[] hash2 = new int[2001];
        for (int num : nums2) {
            hash2[num + 1000] = 1;
        }
        for (int num : nums1) {
            if (hash2[num + 1000] == 0) {
                res.get(0).add(num);
                hash2[num + 1000] = 1;
            }
        }
        for (int num : nums2) {
            if (hash1[num + 1000] == 0) {
                res.get(1).add(num);
                hash1[num + 1000] = 1;
            }
        }
        return res;
    }
}