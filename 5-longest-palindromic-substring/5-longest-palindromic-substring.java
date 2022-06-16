class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp =new boolean[n][n];
        int count = 0;
        String ans = "";
        
        for(int g=0;g<n;g++){
            for(int i=0,j=g;j<n;i++,j++){
                if(g==0){
                    dp[i][j]=true;
                }else if(g==1){
                    dp[i][j] = s.charAt(i)==s.charAt(j);
                }else{
                    dp[i][j] = (s.charAt(i)==s.charAt(j)) && dp[i+1][j-1];
                }
                
                if(dp[i][j] && j-i>=ans.length()){
                    ans=s.substring(i,j+1);
                }
            }
        }
        return ans;
    }
}