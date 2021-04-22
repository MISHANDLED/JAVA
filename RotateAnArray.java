/*
https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/rotate-an-array-official/ojquestion
*/

import java.io. * ;
import java.util. * ;

public class Main {
	public static void display(int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int val: a) {
			sb.append(val + " ");
		}
		System.out.println(sb);
	}

	public static void rotate(int[] a, int k) {
		int n = a.length;
		k = k % n;
		if(k<0){
		    k=k+n;
		}
		while (k > 0) {
			int last = a[n - 1];

			for (int i = n - 2; i >= 0; i--) {
				a[i + 1] = a[i];
			}

			a[0] = last;

			k--;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System. in ));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		int k = Integer.parseInt(br.readLine());

		rotate(a, k);
		display(a);
	}

}
