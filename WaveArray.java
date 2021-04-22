/*
https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/wakanda-1-official/ojquestion
*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int[][] arr = new int[rows][cols];
    int i=0;
    int j=0;
    
    for(i=0;i<rows;i++){
        for(j=0;j<cols;j++){
            arr[i][j] = sc.nextInt();
        }
    }
    
    int count = 0;
    j=0;
    while(j<cols){
        
        if(count == 0){
            for(i=0;i<rows;i++){
                System.out.println(arr[i][j]);
            }
            count = 1;
        }
        
        else{
            for(i=rows-1;i>=0;i--){
                System.out.println(arr[i][j]);
            }
            count = 0;
        }
        
        
        
        j++;
    }
    
    
 }

}
