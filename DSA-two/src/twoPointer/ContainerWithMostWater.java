package twoPointer;

//	Given n non-negative integers A[0], A[1], ..., A[n-1] , 
//	where each represents a point at coordinate (i, A[i]).
//	N vertical lines are drawn such that the two endpoints of line i is at (i, A[i]) and (i, 0).
//	Find two lines, which together with x-axis forms a container, 
//	such that the container contains the most water.
//	Note: You may not slant the container.
//	Input 1:				Output:
//	A = [1, 5, 4, 3]			6
public  class ContainerWithMostWater {
	public static int maxArea(int[] A) {
		int p1 = 0;
		int p2 = A.length - 1; // kept two pointers
		int ans = 0;

		if (A.length == 1)
			return 0; // corner case

		while (p1 < p2) {
			int width = p2 - p1;
			int height = Math.min(A[p1], A[p2]); // we'll take min height for calculation
			int area = width * height; // calculated area and stored the maximum area
			ans = Math.max(area, ans);
			
			if (A[p1] > A[p2]) { // which ever is smaller that cannot form a max ans so we are discarding that element
				p2--;
			} else {
				p1++;
			}
			
		}
		return ans;
	}

	public static void main(String[] args) {
		int A[]= {1, 5, 4, 3};
		System.out.println(maxArea(A));

	}

}
