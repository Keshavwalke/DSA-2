package twoPointer;

import java.util.ArrayList;
import java.util.Arrays;

//	Given an array of positive integers A and an integer B, find and return first continuous subarray 
//	which adds to B.If the answer does not exist return an array with a single element "-1".
//	First sub-array means the sub-array for which starting index in minimum.
//	Input 1:						Output:
//		 A = [1, 2, 3, 4, 5]			 [2, 3]
//		 B = 5
public class SubarrayWithGivenSum {
	public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
		 int N=A.size();
			ArrayList<Integer> arr = new ArrayList<>();
			arr.add(-1); // added -1 in case nothing matches
			int p1 = 0, p2 = 0;
			int sum = A.get(0);

			while (p1 < N && p2 < N) {
				if (sum == B) { // if sum equals cleared that -1 and filled from p1 to p2
					arr.clear();
					for (int i = p1; i <= p2; i++) {
						arr.add(A.get(i));
					}
					return arr;
				} else if (sum < B && p2 < N - 1) { // if sum is lesser then we need to add
					p2++;
					sum += A.get(p2);

				} else {
					sum -= A.get(p1); // if sum is greater removing first element
					p1++;
				}
			}
			return arr;
	}

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		int B = 5;
		ArrayList<Integer> ans = solve(A, B);
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
	}

}
