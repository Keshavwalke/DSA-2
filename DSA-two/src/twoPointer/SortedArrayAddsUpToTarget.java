package twoPointer;
//		Given sorted array return true if there exist a pair A[i]+A[j]=target 
//      where i!=j and i<j

public class SortedArrayAddsUpToTarget {
	public static boolean solve(int[] A, int target) {
		int N = A.length;
		int p1 = 0;			//took two pointers one from start and one from end
		int p2 = N - 1;
		while (p1 < p2) {
			if (A[p1] + A[p2] == target) {
				return true;
			} else if (A[p1] + A[p2] > target) {		//if value is greater than means we need to minimize
				p2--;									// and we can minimize by eliminating last element
			} else {
				p1++;				//if lesser increase by adding starting pointer
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int A[] = { 0, 1, 3, 5, 6, 7, 8, 9, 22, 44 };
		int target = 13;
		System.out.println(solve(A, target));
	}

}