package twoPointer;

import java.util.Arrays;

//		Given an one-dimensional integer array A of size N and an integer B.

//		Count all distinct pairs with difference equal to B.
//		Here a pair is defined as an integer pair (x, y), 
//		where x and y are both numbers in the array and their absolute difference is B.
//		Input 1:						Output:
//			 A = [1, 5, 3, 4, 2]			2
//			 B = 3

public class DistinctPairsWithGivenDifference {
	public static int solve(int[] A, int B) {
		Arrays.sort(A); // sorted the array
		int N = A.length;

		int p1 = 0, p2 = 1; // took two pointers
		int count = 0;

		while (p2 < N) {
			int value = Math.abs(A[p2] - A[p1]); // found difference betn pairs
			if (value == B) {

				while (p1 + 1 < N && A[p1 + 1] == A[p1]) { // increased p1 till we found next value
					p1++;
				}

				while (p2 + 1 < N && A[p2 + 1] == A[p2]) { // increased p2 till we found next value
					p2++;
				}

				count++; // as we confirmed value==B count increased
				p1++;
				p2++;
			}

			else if (value > B) { // if greater increased first pointer
				p1++;
				if (p1 == p2) { // made sure p1 and p2 are not same
					p2++;
				}
			} else { // if lesser increased second pointer
				p2++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int A[]= {1, 5, 3, 4, 2};
		int B=3;
		System.out.println(solve(A,B));

	}

}
