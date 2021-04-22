/*
Website - CodeChef
Problem Code - CONFLIP
*/

/* package codechef; // don't place package name! */

import java.util. * ;
import java.lang. * ;
import java.io. * ;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System. in );
		int T = sc.nextInt();
		while (T > 0) {

			int G = sc.nextInt();

			while (G > 0) {

				int I = sc.nextInt();
				int N = sc.nextInt();
				int Q = sc.nextInt();

				if (N % 2 == 0) {
					System.out.println(N / 2);
				}

				else {

					if (I == Q) {
						System.out.println(N / 2);
					}

					else {
						System.out.println(N / 2 + 1);
					}
				}

				G--;
			}

			T--;
		}

	}
}
