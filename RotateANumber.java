/*
1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340
*/

import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     int Number = sc.nextInt();
     int k = sc.nextInt();
     int total = 0;
     int temp = Number;

     
     
     while(temp>0){
        temp/=10;
        total++;
     }
     
     
     k = k%total;
     
     if(k<0){
         k = k + total;
     }
     
     int divisor = (int)Math.pow(10,k);
     int multiplier = (int)Math.pow(10,total-k);
     
     int rotated = (((Number%divisor) * multiplier) + (Number/divisor));
     
     System.out.println(rotated);
     
     
    }
   }
