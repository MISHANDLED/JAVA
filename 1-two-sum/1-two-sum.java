class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int  x = 0;
        
        Map<Integer, Integer> ht1 = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++){
            x = target - nums[i];
            
            if(ht1.containsKey(x)){
                ans[0] = ht1.get(x);
                ans[1] = i;
                break;
            }else{
                ht1.put(nums[i],i);
            }
            
            
        }
        
    return ans;}
}