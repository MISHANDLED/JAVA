/*
1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to multiply n1 and n2 and print the value.

Constraints

2 <= b <= 10
0 <= n1 <= 10000
0 <= n2 <= 10000
*/


import java.util.*;

public class Main{
public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

   public static int getSum(int b, int n1, int n2){
       int ans = 0;
       int c = 0;
       int p = 1;
       
       while(n1>0 || n2>0 || c>0){
           int d1 = n1%10;
           int d2 = n2%10;
           n1/=10;
           n2/=10;
           
           int d = d1 + d2+ c;
           c = d/b;
           d = d%b;
           
           ans += d*p;
           p*=10;
       }
       
       return ans;
   }



 public static int getProduct(int b, int n1, int n2){
     
     int temp = n1;
     int realsum = 0;
     int xpower = 1;
    
    while(n2>0){
        int d2 = n2%10;
        int carry = 0;
        int sum = 0;
        
        int power = xpower;
        n1 = temp;
        
        while(n1>0 || carry > 0){
            
            int d1 = n1%10;
            int tempsum = ((d1*d2) + carry);
            carry = (tempsum/b);
            sum = sum +((tempsum%b)*power);
            power = power * 10;
            
            n1 = n1/10;
        }
        
        n2 = n2/10;
        realsum = getSum(b,realsum,sum);
        xpower = xpower * 10;
        
        
    }
    
    return realsum;
    
    
     }

}
