/*
https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subsets-of-array-official/ojquestion
*/
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int[] arr = new int[t];
    
    for(int i=0;i<t;i++){
        arr[i] = sc.nextInt();
    }
    
    int total = 1<<t;
    
    for(int i=0;i<total;i++){
        String set = "";
        int temp = i;
        
        for(int j=t-1;j>=0;j--){
            int r = temp%2;
            temp /= 2;
            
            if(r==0){
                set = "-\t" + set;
            }
            
            else{
                set = arr[j] + "\t" + set;
            }
        }
        
        System.out.println(set);
        
        
    }

 }

}
