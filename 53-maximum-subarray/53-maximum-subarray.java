class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int csum = 0;
        int osum = nums[0];
        
        for(int i=0;i<n;i++){
            csum+=nums[i];
            osum=Math.max(osum,csum);
            if(csum<0){
                csum=0;
            }
        }
        return osum;
    }
}