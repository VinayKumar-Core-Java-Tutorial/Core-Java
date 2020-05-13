package _6.Patterns_Programs;

import java.util.Scanner;

public class Halfdiamondnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, j, k, N, count = 0;
		N = sc.nextInt();
		for (i = 1; i <= N; i++) {
			k = 1;
			for (j = 0; j < i; j++) {
				System.out.print(i);
				if (k < i) {
					System.out.print("*");
					k = k + 1;
				}
			}
			System.out.print("\n");
		}

		for (i = N; i > 0; i--) {
			k = 1;
			for (j = 0; j < i; j++) {
				System.out.print(i);
				if (k < i) {
					System.out.print("*");
					k = k + 1;
				}
			}
			System.out.println();
		}

	}

}
