// LeetCode Question - 349

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
        List<Integer> x =  new ArrayList<Integer>();

        for(int i=0;i<nums1.length;i++){
            if(map1.containsKey(nums1[i])){
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            }else{
                map1.put(nums1[i], 1);
            }
        }



        for (int key : nums2) {
            if(map1.containsKey(key) && !x.contains(key)){
                x.add(key);
              }
        }

        return x.stream().mapToInt(i -> i).toArray();

    }
}
