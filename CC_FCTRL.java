/*
Website - CodeChef
Problem Code - FCTRL
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static int Fact(int n){
        int k = 0;
        int sum = 0;
        while(true){
            int x = (int)Math.pow(5,k+1);
            if(x>n){
                break;
            }
            
            else{
                k++;
            }
            
        }
        
        for(int i=1;i<=k;i++){
            int m = (int)Math.pow(5,i);
            sum += (n/m);
        }
        
        
        return sum;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    System.out.println(Fact(n));
		    t--;
		}
	}
}
