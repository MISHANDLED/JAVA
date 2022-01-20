// LeetCode Question - 118

class Solution {
    public List<List<Integer>> generate(int numRows) {
     List<List<Integer>> listOfLists = new ArrayList<>();



        for(int i=0;i<numRows;i++){
            List<Integer> listarr = new ArrayList<Integer>();

            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    listarr.add(1);
                }else{
                    int val = listOfLists.get(i-1).get(j-1) + listOfLists.get(i-1).get(j);
                    listarr.add(val);
                }
            }
            listOfLists.add(listarr);

        }

        return listOfLists;
    }
}
