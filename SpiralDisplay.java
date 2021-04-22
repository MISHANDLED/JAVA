/*
https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/spiral-display-official/ojquestion
*/

import java.io. * ;
import java.util. * ;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System. in );
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int minr = 0;
		int minc = 0;
		int maxr = n - 1;
		int maxc = m - 1;
		int count = 0;
		int total = m * n;

		while (count < total) {

			for (int i = minr; i <= maxr && count < total; i++) {
				System.out.println(arr[i][minc]);
				count++;
			}
			minc++;

			for (int i = minc; i <= maxc && count < total; i++) {
				System.out.println(arr[maxr][i]);
				count++;
			}
			maxr--;

			for (int i = maxr; i >= minr && count < total; i--) {
				System.out.println(arr[i][maxc]);
				count++;
			}
			maxc--;

			for (int i = maxc; i >= minc && count < total; i--) {
				System.out.println(arr[minr][i]);
				count++;
			}
			minr++;

		}
	}

}
