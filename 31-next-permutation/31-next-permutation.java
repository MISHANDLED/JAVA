class Solution {
    public void nextPermutation(int[] nums) {
        int idx1 = -1;
        int idx2 = -1;
        
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx1 = i;
                break;
            }
        }
        if(idx1==-1){
            reverse(nums,0);
            return;
        }
        
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[idx1]){
                idx2 = i;
                break;
            }
        }
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
        
        reverse(nums, idx1+1);
    }
    
    public void reverse(int[] nums, int i){
        int j = nums.length - 1;
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}