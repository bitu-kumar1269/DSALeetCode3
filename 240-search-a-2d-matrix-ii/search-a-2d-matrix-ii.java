class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        int low = 0, high = m-1;

        while(low < n && high > -1){
            int curr = matrix[low][high];
            if(curr == target){
                return true;
            }
            else if(target > curr){
                low++;
                
            }else{
                high--;
            }
        }
        return false;
    }
}