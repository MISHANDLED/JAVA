/*
		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n/2;
        int st = 1;
        int count = 1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            
            int cstar = count;
            
            for(int k=1;k<=st;k++){
                System.out.print(cstar+"\t");
                
                if(k<=st/2){
                    cstar++;
                }
                
                else{
                    cstar--;
                }
                
            }
            
            
            if(i<=n/2){
                sp--;
                st+=2;
                count++;
            }
            
            else{
                sp++;
                st-=2;
                count--;
            }
            
          System.out.println();  
        }

    }
}
