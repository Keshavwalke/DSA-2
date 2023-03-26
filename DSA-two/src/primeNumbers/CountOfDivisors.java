package primeNumbers;
//		Given an array of integers A, find and return the count of divisors of each element of the array.

//		NOTE: The order of the resultant array should be the same as the input array.
//		Input :
//			 A = [2, 3, 4, 5]
//			 Output :
//				 [2, 2, 3, 2]

public class CountOfDivisors {
	public int[] solve(int[] A) {
		int N = A.length;
		int ans[] = new int[N]; // created result array

		for (int i = 0; i < N; i++) { // Iterating over all elements of array
			int count = 0;
			for (int j = 1; j <= Math.sqrt(A[i]); j++) { // for each element iterating from 1 to sqrt(element)
				if (A[i] % j == 0) { // If element is divisible by number than means it has divisors

					if (A[i] / j == j) { // if j*j=element means its only 1 divisor not two
						count++;
					} else {
						count += 2; // else two different element
					}
				}
			}
			ans[i] = count; // updated ans of element as count
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
