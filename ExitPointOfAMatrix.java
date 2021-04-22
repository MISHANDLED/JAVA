/*
https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/exit-point-matrix-official/ojquestion
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int i=0,j=0;
        int dir = 0;
        while(true){
            
            switch(dir){
                case 0 : j=j+1;
                        break;
                        
                case 1 : i = i+1;
                        break;
                        
                case 2 : j = j-1;
                        break;
                        
                case 3 : i = i-1;
                        break;
            }
            
            if(i>=n){
                i--;
                break;
            }
            if(j>=m){
                j--;
                break;
            }
            
            if(arr[i][j] == 1){
                dir++;
                dir = dir%4;
            }
            
            
            
        }
        
        System.out.println(i);
        System.out.println(j);
    }

}
