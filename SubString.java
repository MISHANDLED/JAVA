/*
https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/print-all-palindromic-substrings-official/ojquestion
*/

import java.io. * ;
import java.util. * ;

public class Main {

	public static boolean palind(String str) {
		boolean flag = true;
		int n = str.length();

		for (int i = 0; i < n / 2; i++) {
			if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(n - 1 - i))) {
				continue;
			}

			else {
				flag = false;
				break;
			}

		}

		return flag;

	}

	public static void solution(String str) {
		int n = str.length();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {

				String str1 = str.substring(i, j);
				boolean flag = palind(str1);

				if (flag) {
					System.out.println(str1);
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System. in );
		String str = scn.next();
		solution(str);
	}

}
