class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
        
        dp = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                dp[i][j] = -1;
            }
        }
        return helper(obstacleGrid, 0, 0, r, c);
    }
    public int helper(int[][] grid, int i, int j, int r, int c){
        if(i>=r || j>=c || grid[i][j]==1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==r-1 && j==c-1){
            return 1;
        }
        return dp[i][j] = helper(grid,i+1,j,r,c) + helper(grid,i,j+1,r,c);
    }
}