class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        int ans = 0;
        int num1 = 1;
        int num2 = 1;
        
        for(int i=3;i<=n;i++){
            ans = num1+num2;
            num1 = num2;
            num2 = ans;
        }
        
        return ans;
    }
}