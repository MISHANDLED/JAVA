/*
https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/rotate-by-90-degree-official/ojquestion
*/

import java.io. * ;
import java.util. * ;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System. in );
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		/*
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                arr[j][i] = sc.nextInt();
            }
        }
        */
		//Another Method - Transpose and then reverse the rows

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {

			int li = 0;
			int ri = n - 1;

			while (li < ri) {
				int temp = arr[i][li];
				arr[i][li] = arr[i][ri];
				arr[i][ri] = temp;
				li++;
				ri--;
			}
		}

		display(arr);
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
