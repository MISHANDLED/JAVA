// LeetCode Question - 74

class Solution {

    public int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int i;

        for(i=0;i<matrix.length;i++){
            if(matrix[i][0]==target){
                return true;
            }
            if(matrix[i][0]>target){
                break;
            }
        }

        if(i-1<0){
            return false;
        }
        int ans = binarySearch(matrix[i-1],0,matrix[i-1].length-1,target);

        return ans==-1?false:true;


    }
}
