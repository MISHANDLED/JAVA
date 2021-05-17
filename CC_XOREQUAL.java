/*
Website - CodeChef
Problem Code - XOREQUAL
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long m = 1000000007;
		while(t-->0){
		    long N = sc.nextLong() - 1;
		    long x = 2;
		    long ans = 1;
		    
		    while(N>0){
		        
		        if(N%2==1){
		            ans = (x*ans)%m;
		        }
		        
		        x = (x*x)%m;
		        
		        N=N/2;
		        
		    }
		    
		    System.out.println(ans);
		    
		    
		}
	}
}
