/*
Website - LeetCode
Problem Name - Maximum Points You Can Obtain from Cards
*/


class Solution {

	public int minSum(int arr[], int n, int k) {
		if (n < k) {
			return - 1;
		}

		int res = 0;
		for (int i = 0; i < k; i++)
		res += arr[i];

		int curr_sum = res;
		for (int i = k; i < n; i++) {
			curr_sum += arr[i] - arr[i - k];
			res = Math.min(res, curr_sum);
		}

		return res;
	}

	public int maxScore(int[] cardPoints, int k) {
		int sum = 0;
		int n = cardPoints.length;

		if (k == n) {
			for (int x: cardPoints) {
				sum += x;
			}
			return sum;
		}

		if (k == 1) {
			return cardPoints[0] > cardPoints[n - 1] ? cardPoints[0] : cardPoints[n - 1];
		}

		for (int i = 0; i < n; i++) {
			sum += cardPoints[i];
		}

		int min = minSum(cardPoints, n, n - k);

		sum = sum - min;

		return sum;

	}
}
