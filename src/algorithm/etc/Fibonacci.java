package algorithm.etc;

/**
 * 1 1 2 3 5 8 13 21 ...
 */
public class Fibonacci {
	
	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibo(n - 2) + fibo(n - 1);
		}
	}

	public static void main(String[] args) {
		int lenght = 10;
		for (int i = 1; i < lenght; i++) {
			System.out.print(fibo(i) + " ");
		}
	}
}
