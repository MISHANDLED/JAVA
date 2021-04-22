/*
https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subarray-problem-official/ojquestion
*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int[] arr = new int[t];
    int i;
    int j;
    int k;
    
    for(i=0;i<t;i++){
        arr[i] = sc.nextInt();
    }
    
    for(i=0;i<t;i++){
        for(j=i;j<t;j++){
            for(k=i;k<=j;k++){
                System.out.print(arr[k]+"\t");
            }
            System.out.println();
        }
    }
 }

}
