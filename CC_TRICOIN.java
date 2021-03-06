/*
Website - CodeChef
Problem Code - TRICOIN
*/

/* package codechef; // don't place package name! */

import java.util. * ;
import java.lang. * ;
import java.io. * ;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static int sum(int x) {
		return (x * (x + 1)) / 2;
	}
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System. in );
		int t = sc.nextInt();
		while (t-->0) {
			int n = sc.nextInt();
			int count = 1;
			while (sum(count) <= n) {
				count++;
			}
			System.out.println(count - 1);

		}
	}
}
