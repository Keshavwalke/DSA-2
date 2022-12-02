package twoPointer;

//	Given sorted array return true if A[j]-A[i]=target
//	where i<j and i!=j
public class DifferenceEqualsTarget {
	public static boolean solve(int A[], int target) {
		int N = A.length;
		int p1 = 0;
		int p2 = 1;
		while (p2 < N) {
			if (A[p2] - A[p1] == target) {
				return true;
			} else if (A[p2] - A[p1] > target) {
				p1++;
				if (p1 == p2)
					p2++;
			} else {
				p2++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int A[] = { -3, -2, 1, 3, 5, 7, 9, 11, 34 };
		int target = 92;
		System.out.println(solve(A, target));

	}

}
