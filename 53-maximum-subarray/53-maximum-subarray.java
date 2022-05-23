class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        
        int csum = 0;
        int osum = Integer.MIN_VALUE;
        
        for(int i : nums){
            csum+=i;
            osum = Math.max(csum, osum);
            if(csum<0){
                csum=0;
            }
        }
        return osum;
    }
}