// LeetCode Question - 383

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int rsize = ransomNote.length();
        int msize = magazine.length();

        if(rsize>msize){
            return false;
        }

        int[] rtotal= new int[26];
        for (int i=0; i<rsize; i++){
            rtotal[ransomNote.charAt(i)-97]++;
        }

        int[] mtotal= new int[26];
        for (int i=0; i<msize; i++){
            mtotal[magazine.charAt(i)-97]++;
        }

        for(int i=0;i<26;i++){
            if(rtotal[i]>mtotal[i]){
                return false;
            }
        }

        return true;
    }
}
