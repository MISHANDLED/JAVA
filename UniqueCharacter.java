// LeetCode Question - 387

class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for (char ch: s.toCharArray()){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
        int i=0;
        for(Character key: s.toCharArray()){

            if(hm.get(key)==1){
                System.out.println(key);
                return i;
            }i++;

        }
        return -1;
    }
}
