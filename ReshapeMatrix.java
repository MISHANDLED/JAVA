// LeetCode Question - 566

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int ir = mat.length;
        int ic = mat[0].length;

        if(r*c!=ir*ic){
            return mat;
        }

        int[][] ans = new int[r][c];
        int k=0;
        int l=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j] = mat[k][l];
                if(l==ic-1){
                    l=0;
                    k++;
                }else{
                    l++;
                }
            }
        }

        return ans;
    }
}
