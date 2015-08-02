package algorithm.etc;

/**
 * 2,3,5,7,11,13,17... 
 */
public class PrimeNumber {
	
	private static void start(int end) {
		for (int n = 1; n <= end; n++) {
			if (isPrime(n)) {
				System.out.println(n);
			}
		}
	}
	
	private static boolean isPrime(int n) {
		if (n % 2 == 0) {
			return false;
		}
		
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		start(10);
	}
}
