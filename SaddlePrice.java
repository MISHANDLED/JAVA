/*
https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/saddle-price-official/ojquestion
*/

import java.io. * ;
import java.util. * ;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System. in );
		int n = sc.nextInt();
		boolean flag = false;

		int cordc = 0;

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < n; i++) {

			int min = Integer.MAX_VALUE;
			flag = false;

			for (int j = 0; j < n; j++) {

				if (arr[i][j] < min) {
					min = arr[i][j];
					cordc = j;
				}
			}

			for (int k = 0; k < n; k++) {
				if (min < arr[k][cordc]) {
					flag = false;
					break;
				}

				else {
					flag = true;
				}
			}

			if (flag) {
				System.out.println(min);
				break;
			}

		}

		if (flag == false) {
			System.out.println("Invalid input");
		}

	}

}
