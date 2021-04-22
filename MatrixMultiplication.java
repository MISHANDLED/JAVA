/*
MATRIX MULTIPLICATION 
*/
import java.io. * ;
import java.util. * ;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System. in );
		int i = 0;
		int j = 0;
		int k = 0;

		int n1 = sc.nextInt();
		int m1 = sc.nextInt();
		int[][] ar1 = new int[n1][m1];
		for (i = 0; i < n1; i++) {
			for (j = 0; j < m1; j++) {
				ar1[i][j] = sc.nextInt();
			}
		}

		int n2 = sc.nextInt();
		int m2 = sc.nextInt();
		int[][] ar2 = new int[n2][m2];
		for (i = 0; i < n2; i++) {
			for (j = 0; j < m2; j++) {
				ar2[i][j] = sc.nextInt();
			}
		}

		int[][] ANS = new int[n1][m2];

		if (m1 != n2) {
			System.out.println("Invalid Input");
		}

		else {

			for (i = 0; i < n1; i++) {
				for (j = 0; j < m2; j++) {
					for (k = 0; k < m1; k++) {
						ANS[i][j] = ANS[i][j] + (ar1[i][k] * ar2[k][j]);
					}
				}
			}

			for (i = 0; i < n1; i++) {
				for (j = 0; j < m2; j++) {
					System.out.print(ANS[i][j] + " ");
				}
				System.out.println();
			}

		}

	}

}
