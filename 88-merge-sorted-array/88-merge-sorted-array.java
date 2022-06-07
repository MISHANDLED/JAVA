class Solution {
    public void merge(int[] nums1, int i, int[] nums2, int j) {
        int k = nums1.length-1;
        i--;
        j--;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        
        while(i>=0){
            nums1[k--] = nums1[i--];
        }
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
    }
}