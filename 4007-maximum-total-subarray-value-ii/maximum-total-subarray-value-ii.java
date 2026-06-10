import java.util.PriorityQueue;

class Solution {
    // Sparse Tables for O(1) Range Maximum and Minimum Queries (RMQ)
    private int[][] maxST;
    private int[][] minST;
    private int[] lg;

    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        
        // Precompute logarithm values for quick access
        lg = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            lg[i] = lg[i / 2] + 1;
        }

        int maxLog = lg[n] + 1;
        maxST = new int[n][maxLog];
        minST = new int[n][maxLog];

        // Initialize Sparse Tables base cases
        for (int i = 0; i < n; i++) {
            maxST[i][0] = nums[i];
            minST[i][0] = nums[i];
        }

        // Fill Sparse Tables
        for (int j = 1; j < maxLog; j++) {
            for (int i = 0; i + (1 << j) <= n; i++) {
                maxST[i][j] = Math.max(maxST[i][j - 1], maxST[i + (1 << (j - 1))][j - 1]);
                minST[i][j] = Math.min(minST[i][j - 1], minST[i + (1 << (j - 1))][j - 1]);
            }
        }

        // Max-Heap stores element structures as: [subarray_value, left_index, right_index]
        // Sorted in descending order based on the subarray_value
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(b[0], a[0]));

        // Push the maximum possible right endpoint (n - 1) for each left endpoint 'i'
        for (int i = 0; i < n; i++) {
            long val = queryValue(i, n - 1);
            pq.offer(new long[]{val, i, n - 1});
        }

        long totalMaxSum = 0;

        // Extract the top k maximum distinct elements
        while (k > 0 && !pq.isEmpty()) {
            long[] current = pq.poll();
            long val = current[0];
            int l = (int) current[1];
            int r = (int) current[2];

            totalMaxSum += val;
            k--;

            // If there's room to shrink the right bound from the right side, 
            // compute the value for r - 1 and push it back into the heap.
            if (r > l) {
                long nextVal = queryValue(l, r - 1);
                pq.offer(new long[]{nextVal, l, r - 1});
            }
        }

        return totalMaxSum;
    }

    // Helper method to retrieve max(nums[l..r]) - min(nums[l..r]) in O(1) time
    private long queryValue(int l, int r) {
        int k = lg[r - l + 1];
        int maxVal = Math.max(maxST[l][k], maxST[r - (1 << k) + 1][k]);
        int minVal = Math.min(minST[l][k], minST[r - (1 << k) + 1][k]);
        return (long) maxVal - minVal;
    }
}