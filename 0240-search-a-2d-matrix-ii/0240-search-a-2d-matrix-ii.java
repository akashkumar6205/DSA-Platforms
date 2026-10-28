class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int lo = 0;
        int hi = cols - 1;

        while (lo < rows && hi >= 0) {
            if (matrix[lo][hi] == target) {
                return true;
            } 
            else if (matrix[lo][hi] > target) {
                hi--;
            } 
            else {
                lo++;
            }
        }

        return false;
    }
}