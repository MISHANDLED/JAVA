class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        
        int i = num1.length()-1;
        int j = num2.length()-1;
        StringBuilder sb = new StringBuilder();
        
        while(i>=0 || j>=0){
            int sum = 0;
            if(i>=0){
                sum+=Character.getNumericValue(num1.charAt(i));
                i--;
            }
            if(j>=0){
                sum+=Character.getNumericValue(num2.charAt(j));
                j--;
            }
            sum+=carry;
            carry = sum/10;
            sum%=10;
            sb.append(sum);
        }
        
        if(carry>0){
            sb.append(carry);
        }
        
        return sb.reverse().toString();
    }
}