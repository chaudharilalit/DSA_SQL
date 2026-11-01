class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans[][] = new int [m][n];
        int row_sum =0;
        int col_sum = 0;
        for(int i=0 ; i< n ; i++){
           row_sum = row_sum + grid[0][i];
           ans[0][i] = row_sum;
        }

        for(int j=0 ; j<m ; j++){
            col_sum = col_sum + grid[j][0];
            ans[j][0] = col_sum;
        }

        for(int i=1 ; i<m ; i++){
            for(int j=1 ; j<n ; j++){
                ans[i][j] = Math.min(ans[i][j-1] , ans[i-1][j]) + grid[i][j];
            }
        }
        return ans[m-1][n-1];
    }
}