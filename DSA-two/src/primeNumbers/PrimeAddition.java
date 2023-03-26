package primeNumbers;

//		You are given an even number N and you need to represent the given number as the sum of primes. 
//		The prime numbers do not necessarily have to be distinct. 
//		It is guaranteed that at least one possible solution exists.
//		You need to determine the minimum number of prime numbers needed to represent the given number.
//		Input		Output:
//		26				2
public class PrimeAddition {

	public int solve(int A) {
		if (A <= 3) {
			return 1;
		}
		// For any even number the sum of two prime number will always be equal to the
		// given number if n is >3
		return 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
