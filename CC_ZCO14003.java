/*
Website - CodeChef
Problem Code - ZCO14003
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    	public static void mergeSort(long[] a, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		long[] l = new long[mid];
		long[] r = new long[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}
		mergeSort(l, mid);
		mergeSort(r, n - mid);

		merge(a, l, r, mid, n - mid);
	}

	public static void merge(
	long[] a, long[] l, long[] r, int left, int right) {

		int i = 0,
		j = 0,
		k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				a[k++] = l[i++];
			}
			else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextLong();
		    
		}
		
		mergeSort(arr, n);
		
		long max = 0;
		
		for(int i=0;i<n;i++){
		    long lol = arr[i] * (n-i);
		    
		    if(lol>max){
		        max = lol;
		    }
		}
		
		System.out.print(max);
		
		
	}
}
