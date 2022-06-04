class Solution {
    List<List<String>> real_ans;
    public List<List<String>> solveNQueens(int n) {
        real_ans = new ArrayList<>();
        helper(new int[n][n], 0, new HashSet<Integer>(), new HashSet<Integer>(), new HashSet<Integer>());
        return real_ans;
        
    }
    public void helper(int[][] board, int i, Set<Integer> dia1, Set<Integer> dia2, Set<Integer> ver){
        if(i==board.length){
            List<String> temp = new ArrayList<>();
            
            for(int[] arr : board){
                StringBuilder sb = new StringBuilder();
                for(int z : arr){
                    sb.append(z==1?"Q":".");
                }
                temp.add(sb.toString());
            }
            real_ans.add(temp);
            return;
        }
        
        for(int j=0;j<board.length;j++){
            if(!dia1.contains(i+j) && !dia2.contains(j-i) && !ver.contains(j)){
                board[i][j] = 1;
                dia1.add(i+j);
                dia2.add(j-i);
                ver.add(j);
                
                helper(board,i+1,dia1,dia2,ver);
                
                board[i][j] = 0;
                dia1.remove(i+j);
                dia2.remove(j-i);
                ver.remove(j);
            }
        }
    }
}