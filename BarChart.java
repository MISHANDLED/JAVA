/*
https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/bar-chart-official/ojquestion
*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int i;int j;
    int[] arr = new int[t];
    int max = -1;
    
    for( i=0;i<t;i++){
        arr[i] = sc.nextInt();
        if(arr[i]>max){
            max = arr[i];
        }
    }
    
    for(i=max;i>0;i--){
        for(j=0;j<t;j++){
            
            if(arr[j] == i){
                System.out.print("*\t");
                arr[j] = arr[j] - 1;
            }
            
            else{
                System.out.print("\t");
            }
            
            
            
        }
        
        System.out.println();
    }
 }

}
