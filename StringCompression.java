/*
https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/string-compression-official/ojquestion
*/

import java.io. * ;
import java.util. * ;

public class Main {

	public static String compression1(String str) {
		String str1 = "";
		int n = str.length();

		for (int i = 1; i < n; i++) {
			if (Character.toLowerCase(str.charAt(i - 1)) == Character.toLowerCase(str.charAt(i))) {
				continue;
			}

			else {
				str1 += str.charAt(i - 1);
			}
		}

		str1 += str.charAt(n - 1);

		return str1;
	}

	public static String compression2(String str) {
		String str2 = "";
		int count = 1;
		int n = str.length();

		for (int i = 1; i < n; i++) {
			if (Character.toLowerCase(str.charAt(i - 1)) == Character.toLowerCase(str.charAt(i))) {
				count++;
			}

			else {
				str2 += str.charAt(i - 1);
				if (count > 1) {
					str2 += count;
					count = 1;
				}

			}
		}

		str2 += str.charAt(n - 1);
		if (count > 1) {
			str2 += count;
			count = 1;
		}

		return str2;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System. in );
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
