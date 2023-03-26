package primeNumbers;

import java.util.HashSet;
import java.util.Set;

//		You have given an array A having N integers. Let say G is the product of all elements of A.
//		You have to find the number of distinct prime divisors of G.
//		Input:
//		    A = [1, 2, 3, 4]
//		Output:
//		     2
//		Explanation:
//		    here G = 1 * 2 * 3 * 4 = 24
//		    and distinct prime divisors of G are [2, 3]
public class DistinctPrimes {

	public int solve(int[] A) {

		int n = A.length;
		int count = 0;
		Set<Integer> set = new HashSet<>(); // created HashSet to store unique values

		for (int i = 0; i < n; i++) { // Iterating over all elements of array
			int temp = A[i];
			for (int j = 2; j * j <= temp; j++) { // Iterating from 2 to sqrt of element
				if (temp % j == 0) { // if j divides the number adding j to HashSet
					set.add(j);
					while (temp % j == 0) //
						temp /= j;
				}
			}
			if (temp > 1)
				set.add(temp);
		}

		return set.size();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
