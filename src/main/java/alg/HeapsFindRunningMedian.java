package alg;

import java.util.Scanner;

public class HeapsFindRunningMedian {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}
			for (int i = 1; i < n; i++) {
				double soma = 0.0;
				for (int j = 0; j < i; j++) {
					soma += a[j];
				}
				System.out.println(soma / i);
			}
		}
	}
}
