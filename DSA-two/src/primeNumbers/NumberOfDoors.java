package primeNumbers;

//		Given an integer A, which denotes the number of doors in a row numbered 1 to A. All the doors are closed initially.
//		A person moves to and fro, changing the states of the doors as follows: 
//		the person opens a door that is already closed and closes a door that is already opened.
//		In the first go, he/she alters the states of doors numbered 1, 2, 3, … , A.
//		In the second go, he/she alters the states of doors numbered 2, 4, 6 ….
//		In the third go, he/she alters the states of doors numbered 3, 6, 9 …
//		This continues till the A'th go in, which you alter the state of the door numbered A.
//		Find and return the number of open doors at the end of the procedure.
//				Input :
//					 A = 5
//				Output 1:
//						2
public class NumberOfDoors {
	public int solve(int A) {
		// door will be open if there are odd number of factors
		// the number which have odd factors are perfect square
		// eg: 9 = 1,,3,9 ; 4 = 1,2,,4;
		return (int) Math.sqrt(A);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
