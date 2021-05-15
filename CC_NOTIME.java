/*
Website - CodeChef
Problem Code - NOTIME
*/

/* package codechef; // don't place package name! */

import java.util. * ;
import java.lang. * ;
import java.io. * ;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System. in );

		boolean ans = false;
		int n = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();

		while (n-->0) {
			int t = sc.nextInt();
			if ((x + t) >= h) {
				ans = true;
				break;
			}
		}

		System.out.println(ans ? "YES": "NO");

	}
}
