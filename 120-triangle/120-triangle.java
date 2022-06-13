class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()+1][triangle.size()+1];
        for(int i=0;i<=triangle.size();i++){
            for(int j=0;j<=triangle.size();j++){
                dp[i][j]=-1;
            }
        }
        return helper(0,0,triangle,dp);
    }
    
    public int helper(int li, int lie, List<List<Integer>> triangle, int[][] dp){
        if(li>=triangle.size() || lie>=triangle.get(li).size()){
            return 0;
        }
        if(dp[li][lie]!=-1){
            return dp[li][lie];
        }
        int minLeft = helper(li+1,lie,triangle,dp);
        int minRight = helper(li+1,lie+1,triangle,dp);
        
        return dp[li][lie] = Math.min(minLeft, minRight) + triangle.get(li).get(lie);
        
    }
}