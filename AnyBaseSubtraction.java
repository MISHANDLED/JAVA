/*
1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to subtract n1 from n2 and print the value.

Constraints

2 <= b <= 10
0 <= n1 <= 256
n1 <= n2 <= 256
*/

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       int carry = 0;
       int ans = 0;
       int power = 1;
       while(n2>0){
           
           int d1 = n1%10;
           int d2 = n2%10;
           int d = d2 - d1 + carry;
           n1 /= 10;
           n2 /= 10;
           
           if(d<0){
               d = d + b;
               carry = -1;
           }
           
           else{
               carry = 0;
           }
           
           ans += d*power;
           power *= 10;
           
           
       }
       
       return ans;
   }
  
  }
