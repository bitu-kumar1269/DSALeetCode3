class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row = 0;
        int col = n - 1; 
        
        while (row < m && col >= 0) { // col >= 0 is a bit cleaner than col > -1
            int curr = matrix[row][col];
            
            if (curr == target) {
                return true;
            } else if (target > curr) {
                row++; // Move down
            } else {
                col--; // Move left
            }
        }
        return false;
    }
}