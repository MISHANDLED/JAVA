/*
Website - CodeChef
Problem Code - LKDNGOLF
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
		
		while(t-->0){
		    long n = sc.nextLong() + 2;
		    long x = sc.nextLong();
		    long k = sc.nextLong();
		    
		    if(x%k==0 || (n-1-x)%k==0){
		        System.out.println("YES");
		    }
		    
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
