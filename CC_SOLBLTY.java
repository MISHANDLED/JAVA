/*
Website - CodeChef
Problem Code - SOLBLTY
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int x = sc.nextInt();
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int ans = (a + (100-x)*b)*10;
	        System.out.println(ans);
	    }
		// your code goes here
	}
}
