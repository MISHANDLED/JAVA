import java.io. * ;
import java.util. * ;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System. in );
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int data = sc.nextInt();

		int low = 0;
		int high = n - 1;
		int mid = 0;

		while (low <= high) {

			mid = (high + low) / 2;

			if (data > arr[mid]) {
				low = mid + 1;
			}

			else if (data < arr[mid]) {
				high = mid - 1;
			}

			else {
			    flag = true;
				break;
			}
		}

		if (flag) {
			int lastmid = mid;
			for (int i = mid + 1; i < n; i++) {
				if (data == arr[i]) {
					lastmid = i;
				}

				else {
					break;
					
				}
			}

			for (int i = mid - 1; i > 0; i--) {
				if (data == arr[i]) {
					mid = i;
				}

				else {
					break;
				}
			}
			
			
			
	    	System.out.println(mid);
		    System.out.println(lastmid);

		}
		
		else{

		System.out.println(-1);
		System.out.println(-1);
}
	}

}
